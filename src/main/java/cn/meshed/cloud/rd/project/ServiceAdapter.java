package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ServiceCmd;
import cn.meshed.cloud.rd.project.data.ServiceReleaseCountDTO;
import cn.meshed.cloud.rd.project.data.ServiceDTO;
import cn.meshed.cloud.rd.project.data.ServiceDetailDTO;
import cn.meshed.cloud.rd.project.query.ProjectPageQry;
import cn.meshed.cloud.rd.project.query.ServiceByMethodQry;
import cn.meshed.cloud.rd.project.query.ServiceByOneQry;
import cn.meshed.cloud.rd.project.query.ServicePageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
     *
     * @param servicePageQry
     * @return {@link PageResponse<ServiceDTO>}
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<ServiceDTO> list(@PathVariable("projectKey") String projectKey, @Valid ServicePageQry servicePageQry);

    /**
     * 详情
     *
     * @param uuid 服务uuid
     * @return {@link SingleResponse<ServiceDetailDTO>}
     */
    @GetMapping("/details/{uuid}")
    SingleResponse<ServiceDetailDTO> details(@PathVariable("uuid") String uuid, @Valid ServiceByOneQry serviceByOneQry);

    /**
     * 保存功能
     *
     * @param serviceCmd 服务数据
     * @return {@link Response}
     */
    @PostMapping("/save")
    Response save(@Valid ServiceCmd serviceCmd);

    /**
     * jar统计
     *
     * @param projectKey 项目key
     * @return {@link SingleResponse<ServiceReleaseCountDTO>}
     */
    @GetMapping("/release/count/{projectKey}")
    SingleResponse<ServiceReleaseCountDTO> releaseCount(@PathVariable("projectKey") String projectKey);

    /**
     * 检查方法是否可用（控制器中唯一性）
     *
     * @param serviceByMethodQry 检查参数
     * @return {@link Response}
     */
    @GetMapping("/check/method")
    Response checkMethod(@Valid ServiceByMethodQry serviceByMethodQry);

}
