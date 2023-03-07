package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <h1>项目操作命令</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@ApiModel(value="项目操作命令")
public class ProjectCmd extends Command {

    /**
     * key
     */
    @ApiModelProperty("key")
    @NotBlank(message = "key不能为空")
    private String key;

    /**
     * name
     */
    @ApiModelProperty("项目名称")
    @NotBlank(message = "名称不能为空")
    private String name;

    /**
     * type
     */
    @ApiModelProperty("项目类型")
    @NotNull(message = "类型不能为空")
    private ProjectTypeEnum type;

    /**
     * 项目级别
     */
    @ApiModelProperty("项目授权模式")
    @NotNull(message = "授权模式不能为空")
    private ProjectAccessModeEnum accessMode;

    /**
     * 项目模板
     */
    @ApiModelProperty("项目模板")
    private List<String> codeTemplates;

    /**
     * 所需设施
     */
    @ApiModelProperty("项目所需设施")
    private List<String> infrastructures;

    /**
     * 描述
     */
    @ApiModelProperty("项目描述")
    private String description;


}
