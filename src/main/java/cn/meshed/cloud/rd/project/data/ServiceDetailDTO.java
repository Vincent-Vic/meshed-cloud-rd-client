package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.RequestModeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * <h1>服务详情传输数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务详情传输数据")
public class ServiceDetailDTO extends ServiceDTO {

    /**
     * 领域
     */
    @Schema(description = "领域")
    private String domain;

    /**
     * method
     */
    @Schema(description = "方法名称")
    private String method;
    /**
     * 服务请求参数模式
     */
    @Schema(description = "服务请求参数模式")
    private RequestModeEnum requestMode;
    /**
     * 服务授权码，用于注册身份安全
     */
    @Schema(description = "服务授权码")
    private String identifier;
    /**
     * 详情
     */
    @Schema(description = "详情")
    private String description;
    /**
     * 请求参数传输列表
     */
    @Schema(description = "请求参数传输列表")
    private List<RequestFieldDTO> requests;
    /**
     * 响应字段列表
     */
    @Schema(description = "响应字段列表")
    private List<ResponsesFieldDTO> responses;

}
