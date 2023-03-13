package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.data.RequestFieldDTO;
import cn.meshed.cloud.rd.project.data.ResponsesFieldDTO;
import cn.meshed.cloud.rd.project.enums.OperateEnum;
import cn.meshed.cloud.rd.project.enums.RequestModeEnum;
import cn.meshed.cloud.rd.project.enums.RequestTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Command;
import lombok.Data;

import java.util.List;

/**
 * <h1>服务新增</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ServiceGroupCmd extends Command {

    /**
     * uuid
     */
    private String uuid;

    /**
     * 服务分组名称
     */
    private String name;

    /**
     * 服务分组标识 （className主体）
     */
    private String key;

    /**
     * 服务分组uri
     */
    private String uri;


    /**
     * 服务分组所属领域key
     */
    private String domain;

    /**
     * 模型分组所属项目key
     */
    private String projectKey;

    /**
     * 服务分组描述
     */
    private String description;

    /**
     * 服务类型 （className后缀）
     */
    private ServiceTypeEnum type;
}
