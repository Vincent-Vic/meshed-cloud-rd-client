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
@Schema(description = "服务分组")
public class ServiceGroupSelectDTO {

    /**
     * uuid
     */
    @Schema(description = "通用唯一编码")
    private String uuid;

    /**
     * 服务分组名称
     */
    @Schema(description = "服务分组名称")
    private String name;

    /**
     * 服务映射类名
     */
    @Schema(description = "服务映射类名")
    private String className;

    /**
     * 服务类型
     */
    @Schema(description = "服务类型")
    private ServiceTypeEnum type;

}
