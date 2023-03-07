package cn.meshed.cloud.rd.project.event;

import cn.meshed.cloud.dto.SecurityEvent;
import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import lombok.Data;

import java.util.List;

/**
 * <h1>项目初始化事件</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ProjectInitializeEvent extends SecurityEvent {

    /**
     * uuid
     */
    private String uuid;

    /**
     * key
     */
    private String key;

    /**
     * name
     */
    private String name;

    /**
     * type
     */
    private ProjectTypeEnum type;

    /**
     * 项目级别
     */
    private ProjectAccessModeEnum accessMode;

    /**
     * 仓库构建代码模板
     */
    private List<String> codeTemplates;

    /**
     * 基础设施列表
     */
    private List<String> infrastructures;

    /**
     * 描述
     */
    private String description;

}
