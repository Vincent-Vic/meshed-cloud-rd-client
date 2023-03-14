package cn.meshed.cloud.rd.project.data;

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
@Schema(title = "服务分组")
public class ServiceGroupDTO {

    /**
     * uuid
     */
    @Schema(title = "通用唯一编码")
    private String uuid;

    /**
     * 服务分组名称
     */
    @Schema(title = "服务分组名称")
    private String name;

    /**
     * 服务分组uri
     */
    @Schema(title = "服务分组uri")
    private String uri;

    /**
     * 服务映射类名
     */
    @Schema(title = "服务映射类名")
    private String className;

    /**
     * 服务分组包名
     */
    @Schema(title = "服务分组包名")
    private String packageName;

    /**
     * 服务分组版本号
     */
    @Schema(title = "服务分组版本号")
    private String version;

    /**
     * 服务分组所属领域key
     */
    @Schema(title = "服务分组所属领域key")
    private String domain;

    /**
     * 模型分组所属项目唯一标识
     */
    @Schema(title = "模型分组所属项目唯一标识")
    private String projectKey;

    /**
     * 服务分组描述
     */
    @Schema(title = "服务分组描述")
    private String description;

    /**
     * 服务类型
     */
    @Schema(title = "服务类型")
    private ServiceTypeEnum type;
}
