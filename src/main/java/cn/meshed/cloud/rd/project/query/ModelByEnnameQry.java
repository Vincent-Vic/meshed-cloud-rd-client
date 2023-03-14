package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>模型英文名查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "模型英文名查询参数")
public class ModelByEnnameQry extends Query {
    /**
     * className
     */
    @Schema(description = "类名前缀")
    private String enname;
    /**
     * 类型
     */
    @Schema(description = "模型类型")
    private ModelTypeEnum type;
    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    private String projectKey;

}
