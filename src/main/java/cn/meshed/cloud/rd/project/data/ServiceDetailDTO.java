package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.RequestModeEnum;
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
     * method
     */
    private String method;
    /**
     * 服务请求参数模式
     */
    private RequestModeEnum requestMode;
    /**
     * 服务授权码，用于注册身份安全
     */
    private String identifier;
    /**
     * 详情
     */
    private String description;
    /**
     * 请求参数传输列表
     */
    private List<RequestFieldDTO> requests;
    /**
     * 相应字段列表
     */
    private List<ResponsesFieldDTO> responses;

}
