package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>服务分组</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务分组")
public class ServiceGroupQry {

    /**
     * 服务分组名称
     */
    @Schema(description = "服务分组名称")
    private String name;

    /**
     * 服务分组所属领域key
     */
    @Schema(description = "服务分组所属领域key")
    private String domain;

    /**
     * 模型分组所属项目唯一标识
     */
    @Schema(description = "模型分组所属项目唯一标识")
    private String projectKey;

    /**
     * 服务类型
     */
    @Schema(description = "服务类型")
    private ServiceTypeEnum type;
}
