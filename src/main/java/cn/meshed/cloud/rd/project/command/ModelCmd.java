package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <h1>模型传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ModelCmd extends Command {
    /**
     * uuid
     */
    private String uuid;
    /**
     * 模型中文名
     */
    private String name;
    /**
     * 模型英文名
     */
    private String enname;
    /**
     * 模型实体父类名称
     */
    private String superClass;
    /**
     * 领域
     */
    private String domain;
    /**
     * 类型
     */
    private ModelTypeEnum type;
    /**
     * 详情
     */
    private String description;

}
