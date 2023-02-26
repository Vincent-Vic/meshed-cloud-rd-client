package cn.meshed.cloud.rd.project.command;

import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class DomainCmd extends Command {

    /**
     * 项目标识
     */
    private String projectKey;

    /**
     * 名称
     */
    private String name;
    /**
     * 领域唯一标识 符合Java 类名规范
     */
    private String key;


}
