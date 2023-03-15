package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <h1>方法查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "方法查询参数")
public class ServiceAvailableClassQry extends Query {
    /**
     * 类型
     */
    @Schema(description = "类型")
    @NotNull(message = "服务类型不能为空")
    private ServiceTypeEnum type;
    /**
     * 控制器
     */
    @Schema(description = "分组标识")
    @NotBlank(message = "分组标识不能为空")
    private String key;
    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    @NotBlank(message = "项目唯一标识不能为空")
    private String projectKey;

}
