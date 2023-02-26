package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.RequestTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceBehaviorEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import lombok.Data;

import java.util.List;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ServiceDetailDTO extends ServiceDTO {

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
     * 控制器实体类名
     */
    private String className;
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
