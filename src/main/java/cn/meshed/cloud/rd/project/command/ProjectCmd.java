package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <h1>项目操作数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "项目操作数据")
public class ProjectCmd extends Command {

    /**
     * key
     */
    @Schema(description = "项目唯一标识")
    @NotBlank(message = "key不能为空")
    private String key;

    /**
     * name
     */
    @Schema(description = "项目名称")
    @NotBlank(message = "名称不能为空")
    private String name;

    /**
     * type
     */
    @Schema(description = "项目类型")
    @NotNull(message = "类型不能为空")
    private ProjectTypeEnum type;

    /**
     * 项目级别
     */
    @Schema(description = "项目授权模式")
    @NotNull(message = "授权模式不能为空")
    private ProjectAccessModeEnum accessMode;

    /**
     * 项目模板
     */
    @Schema(description = "项目模板")
    private List<String> codeTemplates;

    /**
     * 所需设施
     */
    @Schema(description = "项目所需设施")
    private List<String> infrastructures;

    /**
     * 描述
     */
    @Schema(description = "项目描述")
    @NotBlank(message = "")
    private String description;


}
