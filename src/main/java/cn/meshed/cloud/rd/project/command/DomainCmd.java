package cn.meshed.cloud.rd.project.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>领域操作数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "领域操作数据")
public class DomainCmd extends Command {

    /**
     * 项目标识
     */
    @Schema(description = "项目唯一标识")
    @NotBlank(message = "项目唯一标识不能为空")
    private String projectKey;

    /**
     * 名称
     */
    @Schema(description = "领域名称")
    @NotBlank(message = "领域名称")
    private String name;
    /**
     * 领域唯一标识 符合Java 类名规范
     */
    @Schema(description = "领域唯一标识")
    @NotBlank(message = "领域唯一标识不能为空")
    private String key;


}
