package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ModelCmd;
import cn.meshed.cloud.rd.project.data.ModelDTO;
import cn.meshed.cloud.rd.project.data.ModelDetailDTO;
import cn.meshed.cloud.rd.project.query.ModelOperateQry;
import cn.meshed.cloud.rd.project.query.ProjectQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>数据模型适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/model")
public interface ModelAdapter {

    /**
     * 列表
     * @param projectQry
     * @return {@link PageResponse < ProjectDTO >}
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<ModelDTO> list(@PathVariable("projectKey") String projectKey, @Valid ProjectQry projectQry);

    /**
     * 详情
     * @param projectKey 项目key
     * @return {@link SingleResponse < ProjectDetailDTO >}
     */
    @GetMapping("/details/{uuid}")
    SingleResponse<ModelDetailDTO> details(@PathVariable("uuid") String projectKey, @Valid ModelOperateQry modelOperateQry);

    /**
     * 保存功能
     * @param modelCmd 服务数据
     * @return {@link Response}
     */
    @PostMapping("/save")
    Response save(@Valid ModelCmd modelCmd);

}
