package cn.meshed.cloud.rd.project.event;

import cn.meshed.cloud.dto.SecurityEvent;
import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <h1>项目初始化事件</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "项目初始化事件")
public class ProjectInitializeEvent extends SecurityEvent {

    /**
     * uuid
     */
    @Schema(title = "通用唯一编码")
    private String uuid;

    /**
     * key
     */
    @Schema(title = "项目唯一标识")
    private String key;

    /**
     * name
     */
    @Schema(title = "项目名称")
    private String name;

    /**
     * type
     */
    @Schema(title = "项目类型")
    private ProjectTypeEnum type;

    /**
     * 项目访问模式
     */
    @Schema(title = "项目访问模式")
    private ProjectAccessModeEnum accessMode;

    /**
     * 仓库构建代码模板
     */
    @Schema(title = "仓库构建代码模板")
    private List<String> codeTemplates;

    /**
     * 基础设施列表
     */
    @Schema(title = "基础设施列表")
    private List<String> infrastructures;

    /**
     * 描述
     */
    private String description;

}
