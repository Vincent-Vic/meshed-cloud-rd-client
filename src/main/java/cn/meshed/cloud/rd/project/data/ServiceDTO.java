package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.RequestTypeEnum;
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
@Schema(title = "服务传输数据")
public class ServiceDTO {

    /**
     * uuid
     */
    @Schema(title = "通用唯一编码")
    private String uuid;
    /**
     * 模型中文名
     */
    @Schema(title = "模型中文名")
    private String name;

    /**
     * URI
     */
    @Schema(title = "URI")
    private String uri;

    /**
     * 请求类型
     */
    @Schema(title = "请求类型")
    private RequestTypeEnum requestType;

    /**
     * 控制器实体类名
     */
    @Schema(title = "控制器实体类名")
    private String className;

    /**
     * 版本
     */
    @Schema(title = "版本")
    private String version;

    /**
     * 类型
     */
    @Schema(title = "类型")
    private ServiceTypeEnum type;

    /**
     * 模型作用
     */
    @Schema(title = "模型作用")
    private ServiceModelStatusEnum status;

    /**
     * 版本状态
     */
    @Schema(title = "版本状态")
    private ReleaseStatusEnum releaseStatus;

}
