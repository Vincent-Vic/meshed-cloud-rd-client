package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ModelCmd;
import cn.meshed.cloud.rd.project.data.ModelDTO;
import cn.meshed.cloud.rd.project.data.ModelDetailDTO;
import cn.meshed.cloud.rd.project.query.ModelByEnnameQry;
import cn.meshed.cloud.rd.project.query.ModelByOneQry;
import cn.meshed.cloud.rd.project.query.ModelPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
     *
     * @param modelPageQry 模型分页查询
     * @return {@link PageResponse<ModelDTO>}
     */
    @Operation(summary = "模型列表")
    @GetMapping("/list/{projectKey}")
    PageResponse<ModelDTO> list(@Parameter(description = "项目唯一标识") @PathVariable("projectKey") String projectKey, @Parameter(description = "") @Valid ModelPageQry modelPageQry);

    /**
     * 详情
     *
     * @param uuid 项目唯一标识
     * @return {@link SingleResponse<ModelDetailDTO>}
     */
    @Operation(summary = "模型详情")
    @GetMapping("/details/{uuid}")
    SingleResponse<ModelDetailDTO> details(@Parameter(description = "模型通用编码") @PathVariable("uuid") String uuid, @Parameter(description = "") @Valid ModelByOneQry modelByOneQry);

    /**
     * 保存功能
     *
     * @param modelCmd 服务数据
     * @return {@link Response}
     */
    @Operation(summary = "模型保存")
    @PostMapping("/save")
    Response save(@Parameter(description = "模型操作数据") @Valid @RequestBody ModelCmd modelCmd);

    /**
     * 检查英文名是否合法
     *
     * @param modelByEnnameQry 检查参数
     * @return {@link Response}
     */
    @Operation(summary = "检查模型英文标识")
    @GetMapping("/check/enname")
    Response checkEnname(@Parameter(description = "模型英文标识查询参数") @Valid ModelByEnnameQry modelByEnnameQry);

}
