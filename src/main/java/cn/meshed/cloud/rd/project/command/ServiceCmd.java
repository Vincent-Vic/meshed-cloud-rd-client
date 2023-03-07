package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.data.RequestBodyFieldDTO;
import cn.meshed.cloud.rd.project.data.RequestParamFieldDTO;
import cn.meshed.cloud.rd.project.data.ResponsesFieldDTO;
import cn.meshed.cloud.rd.project.enums.OperateEnum;
import cn.meshed.cloud.rd.project.enums.RequestTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceBehaviorEnum;
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
public class ServiceCmd extends Command {

    /**
     * uuid
     */
    private String uuid;
    /**
     * 项目key
     */
    private String projectKey;
    /**
    /**
     * 项目method
     */
    private String method;
    /**
     * 操作类型
     */
    private OperateEnum operate;
    /**
     * 模型中文名
     */
    private String name;
    /**
     * 类型
     */
    private ServiceTypeEnum type;
    /**
     * 领域
     */
    private String domain;
    /**
     * 控制器
     */
    private String control;
    /**
     * URI
     */
    private String uri;
    /**
     * 请求类型
     */
    private RequestTypeEnum requestType;
    /**
     * 服务业务行为能力
     */
    private ServiceBehaviorEnum behavior;
    /**
     * 服务授权码，用于注册身份安全
     */
    private ServiceTypeEnum identifier;
    /**
     * 详情
     */
    private String description;
    /**
     * 请求参数传输列表
     */
    private List<RequestParamFieldDTO> requestParams;
    /**
     * 请求数据传输列表
     */
    private List<RequestBodyFieldDTO> requestBodys;
    /**
     * 相应字段列表
     */
    private List<ResponsesFieldDTO> responses;
}
