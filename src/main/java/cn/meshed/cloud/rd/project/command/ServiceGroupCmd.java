package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>服务新增</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "服务新增")
public class ServiceGroupCmd extends Command {

    /**
     * uuid
     */
    @Schema(title = "项目分组通用唯一编码")
    private String uuid;

    /**
     * 服务分组名称
     */
    @Schema(title = "服务分组名称")
    @NotBlank(message = "服务分组名称不能为空")
    private String name;

    /**
     * 服务分组标识 （className主体）
     */
    @Schema(title = "服务分组标识")
    @NotBlank(message = "服务分组标识不能为空")
    private String key;

    /**
     * 服务分组URI
     */
    @Schema(title = "服务分组URI(分组内路径前缀)")
    private String uri;


    /**
     * 服务分组所属领域唯一标识
     */
    @Schema(title = "服务分组所属领域唯一标识")
    @NotBlank(message = "服务分组所属领域唯一标识不能为空")
    private String domain;

    /**
     * 服务分组所属项目唯一标识
     */
    @Schema(title = "服务分组所属项目唯一标识")
    @NotBlank(message = "服务分组所属项目唯一标识不能为空")
    private String projectKey;

    /**
     * 服务分组描述
     */
    @Schema(title = "服务分组描述")
    @NotBlank(message = "服务分组描述不能为空")
    private String description;

    /**
     * 服务类型 （className后缀）
     */
    @Schema(title = "服务类型")
    @NotBlank(message = "服务类型不能为空")
    private ServiceTypeEnum type;
}
