package cn.meshed.cloud.rd.project.command;

import cn.meshed.cloud.rd.project.data.RequestFieldDTO;
import cn.meshed.cloud.rd.project.data.ResponsesFieldDTO;
import cn.meshed.cloud.rd.project.enums.OperateEnum;
import cn.meshed.cloud.rd.project.enums.RequestModeEnum;
import cn.meshed.cloud.rd.project.enums.RequestTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <h1>服务新增数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务新增数据")
public class ServiceCmd extends Command {

    /**
     * uuid
     */
    @Schema(description = "项目通用唯一编码")
    private String uuid;
    /**
     * 服务分组ID
     */
    @Schema(description = "服务分组ID")
    @NotBlank(message = "服务分组ID不能为空")
    private String groupId;
    /**
     * /**
     * 项目方法名称
     */
    @Schema(description = "项目方法名称")
    @NotBlank(message = "项目方法名称不能为空")
    private String method;
    /**
     * 操作类型
     */
    @Schema(description = "操作类型")
    private OperateEnum operate;
    /**
     * 服务中文解释
     */
    @Schema(description = "服务中文解释")
    @NotBlank(message = "服务中文解释不能为空")
    private String name;
    /**
     * 类型
     */
    @Schema(description = "类型")
    @NotNull(message = "类型不能为空")
    private ServiceTypeEnum type;
    /**
     * URI
     */
    @Schema(description = "URI")
    private String uri;
    /**
     * 服务请求类型
     */
    @Schema(description = "服务请求类型")
    @NotNull(message = "服务请求类型不能为空")
    private RequestTypeEnum requestType;
    /**
     * 服务请求模式
     */
    @Schema(description = "服务请求模式")
    @NotNull(message = "请求模式不能为空")
    private RequestModeEnum requestMode;
    /**
     * 服务响应是否合并
     */
    @Schema(description = "服务响应是否合并")
    @NotNull(message = "响应是否合并不能为空")
    private Boolean responseMerge;
    /**
     * 服务授权码，用于注册身份安全
     */
    @Schema(description = "服务授权码（用于注册身份安全）")
    private String identifier;
    /**
     * 详情
     */
    @Schema(description = "详情")
    @NotBlank(message = "详情不能为空")
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

    /**
     * 服务访问权限
     */
    @Schema(description = "服务访问权限")
    @NotNull(message = "访问权限不能为空")
    private ServiceAccessModeEnum accessMode;
}
