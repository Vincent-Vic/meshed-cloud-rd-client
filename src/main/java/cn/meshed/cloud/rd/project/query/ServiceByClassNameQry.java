package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>方法查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "方法查询参数")
public class ServiceByClassNameQry extends Query {
    /**
     * 类型
     */
    @Schema(description = "类型")
    private ServiceTypeEnum type;
    /**
     * 控制器
     */
    @Schema(description = "控制器")
    private String control;
    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    private String projectKey;

}
