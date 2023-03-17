package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.RequestTypeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ServiceModelStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>服务传输数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务传输数据")
public class ServiceDTO {

    /**
     * uuid
     */
    @Schema(description = "通用唯一编码")
    private String uuid;
    /**
     * 模型中文名
     */
    @Schema(description = "模型中文名")
    private String name;

    /**
     * 服务分组uri（URI前缀）
     */
    @Schema(description = "服务分组uri（URI前缀）")
    private String preUri;

    /**
     * URI
     */
    @Schema(description = "URI")
    private String uri;

    /**
     * 服务分组名称
     */
    @Schema(description = "服务分组名称")
    private String groupName;

    /**
     * 服务分组ID
     */
    @Schema(description = "服务分组ID")
    private String groupId;

    /**
     * 请求类型
     */
    @Schema(description = "请求类型")
    private RequestTypeEnum requestType;

    /**
     * 控制器实体类名
     */
    @Schema(description = "控制器实体类名")
    private String className;

    /**
     * 版本
     */
    @Schema(description = "版本")
    private Long version;

    /**
     * 服务负责人
     */
    @Schema(description = "服务负责人")
    private Long owner;

    /**
     * 服务授权码，用于注册身份安全
     */
    @Schema(description = "服务授权码")
    private String identifier;

    /**
     * 类型
     */
    @Schema(description = "类型")
    private ServiceTypeEnum type;

    /**
     * 服务级别 当前仅支持跟随项目性质（组件）
     */
    @Schema(description = "服务级别")
    private ServiceAccessModeEnum accessMode;

    /**
     * 模型作用
     */
    @Schema(description = "模型作用")
    private ServiceModelStatusEnum status;

    /**
     * 版本状态
     */
    @Schema(description = "版本状态")
    private ReleaseStatusEnum releaseStatus;

}
