package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectStatusEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import lombok.Data;

/**
 * <h1>项目传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ProjectDTO {

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
     * 状态
     */
    private ProjectStatusEnum status;

    /**
     * 版本号
     */
    private String version;

    /**
     * 负责人
     */
    private String owner;

    /**
     * 项目级别
     */
    private ProjectAccessModeEnum accessMode;

    /**
     * 描述
     */
    private String description;

}
