package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.PageTemplateEnum;
import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTemplateEnum;
import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <h1>项目操作命令</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ProjectCmd extends Command {

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
     * 页面模板
     */
    private PageTemplateEnum pageTemplate;

    /**
     * 服务模板
     */
    private ServiceTemplateEnum serviceTemplate;

    /**
     * 需要mysql缓存
     */
    private boolean needMysql;

    /**
     * 需要redis缓存
     */
    private boolean needRedis;

    /**
     * 描述
     */
    private String description;


}
