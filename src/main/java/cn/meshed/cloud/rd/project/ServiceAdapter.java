package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ServiceCmd;
import cn.meshed.cloud.rd.project.data.ProjectDTO;
import cn.meshed.cloud.rd.project.data.ServiceReleaseCountDTO;
import cn.meshed.cloud.rd.project.data.ServiceDTO;
import cn.meshed.cloud.rd.project.data.ServiceDetailDTO;
import cn.meshed.cloud.rd.project.query.ProjectQry;
import cn.meshed.cloud.rd.project.query.ServiceOperateQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * <h1>服务适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/service")
public interface ServiceAdapter {

    /**
     * 列表
     * @param projectQry
     * @return {@link PageResponse < ProjectDTO >}
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<ServiceDTO> list(@PathVariable("projectKey") String projectKey,@Valid ProjectQry projectQry);

    /**
     * 详情
     * @param uuid 服务uuid
     * @return {@link SingleResponse < ProjectDetailDTO >}
     */
    @GetMapping("/details/{uuid}")
    SingleResponse<ServiceDetailDTO> details(@PathVariable("uuid") String uuid, @Valid ServiceOperateQry serviceOperateQry);

    /**
     * 保存功能
     * @param serviceCmd 服务数据
     * @return {@link Response}
     */
    @PostMapping("/save")
    Response save(@Valid ServiceCmd serviceCmd);

    /**
     * jar统计
     * @param projectKey 项目key
     * @return {@link SingleResponse < ProjectDetailDTO >}
     */
    @GetMapping("/release/count/{projectKey}")
    SingleResponse<ServiceReleaseCountDTO> releaseCount(@PathVariable("projectKey") String projectKey);

}
