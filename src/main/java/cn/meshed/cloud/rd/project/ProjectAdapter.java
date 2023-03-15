package cn.meshed.cloud.rd.project;


import cn.meshed.cloud.rd.project.command.ProjectChangeCmd;
import cn.meshed.cloud.rd.project.command.ProjectCmd;
import cn.meshed.cloud.rd.project.data.ProjectDTO;
import cn.meshed.cloud.rd.project.data.ProjectDetailDTO;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import cn.meshed.cloud.rd.project.query.ProjectPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>项目适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/project")
public interface ProjectAdapter {

    /**
     * 列表
     *
     * @param projectPageQry 项目分页查询
     * @return {@link PageResponse<ProjectDTO>}
     */
    @Operation(summary = "项目列表")
    @GetMapping("/list")
    PageResponse<ProjectDTO> list(@Parameter(description = "分页参数") @Valid ProjectPageQry projectPageQry);

    /**
     * 详情
     *
     * @param projectKey 项目唯一标识
     * @return {@link SingleResponse<ProjectDetailDTO>}
     */
    @Operation(summary = "项目详情")
    @GetMapping("/details/{projectKey}")
    SingleResponse<ProjectDetailDTO> details(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey);

    /**
     * 发起项目（新增项目/申请项目）
     *
     * @param projectCmd 项目数据
     * @return {@link Response}
     */
    @Operation(summary = "发起项目")
    @PutMapping("/apply")
    Response apply(@Parameter(description = "项目操作数据") @Valid @RequestBody ProjectCmd projectCmd);

    /**
     * 变更项目
     *
     * @param type 变更行为： 下线，删除,废弃
     * @param uuid uuid
     * @return {@link Response}
     */
    @Operation(summary = "变更项目")
    @PostMapping("/change/{type}/{uuid}")
    Response change(@Parameter(description = "项目类型") @PathVariable("type") ProjectTypeEnum type, @Parameter(description = "项目通用编码") @PathVariable("uuid") String uuid,
                    @Valid @RequestBody ProjectChangeCmd projectChangeCmd);

    /**
     * 检查key是否唯一性
     *
     * @param key key
     * @return {@link Response}
     */
    @Operation(summary = "检查项目唯一标识")
    @GetMapping("/available/key/{key}")
    Response availableKey(@Parameter(description = "项目唯一标识") @PathVariable("key") String key);

}
