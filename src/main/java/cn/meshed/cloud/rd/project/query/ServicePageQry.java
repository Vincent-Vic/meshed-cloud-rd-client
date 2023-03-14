package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>服务分页查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "服务分页查询参数")
public class ServicePageQry extends PageQuery {

    /**
     * 项目唯一标识
     */
    @Schema(title = "项目唯一标识")
    private String projectKey;
    /**
     * 关键字
     */
    @Schema(title = "关键字")
    private String keyword;
    /**
     * 类型
     */
    @Schema(title = "类型")
    private ServiceTypeEnum type;
    /**
     * 发行状态
     */
    @Schema(title = "发行状态")
    private ReleaseStatusEnum releaseStatus;
    /**
     * 授权模式
     */
    @Schema(title = "授权模式")
    private ProjectAccessModeEnum accessMode;
}
