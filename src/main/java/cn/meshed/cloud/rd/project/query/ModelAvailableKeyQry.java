package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <h1>模型英文名查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "模型英文名查询参数")
public class ModelAvailableKeyQry extends Query {
    /**
     * className
     */
    @Schema(description = "类名前缀")
    @NotBlank(message = "模型标识不能为空")
    private String key;
    /**
     * 类型
     */
    @Schema(description = "模型类型")
    @NotNull(message = "模型类型不能为空")
    private ModelTypeEnum type;
    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    @NotBlank(message = "模型唯一标识不能为空")
    private String projectKey;

}
