package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <h1>项目操作命令</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ProjectChangeCmd extends Command {

    /**
     * uuid
     */
    private String uuid;

    /**
     * type
     */
    private ProjectTypeEnum type;



}
