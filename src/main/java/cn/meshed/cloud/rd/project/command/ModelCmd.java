package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.data.RequestFieldDTO;
import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.OperateEnum;
import com.alibaba.cola.dto.Command;
import lombok.Data;

import java.util.List;

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
     * 模型所属项目key
     */
    private String projectKey;
    /**
     * 模型所属项目key
     */
    private OperateEnum operate;
    /**
     * 类型
     */
    private ModelTypeEnum type;
    /**
     * 详情
     */
    private String description;

    private List<RequestFieldDTO> fields;

}
