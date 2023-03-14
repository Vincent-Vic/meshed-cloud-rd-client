package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.OperateEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>服务查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "服务查询参数")
public class ServiceByOneQry extends Query {

    /**
     * uuid
     */
    @Schema(description = "通用唯一编码")
    private String uuid;
    /**
     * 项目唯一标识
     */
    @Schema(description = "项目唯一标识")
    private String projectKey;
    /**
     * 操作类型
     */
    @Schema(description = "操作类型")
    private OperateEnum operate;
    /**
     * 类型
     */
    @Schema(description = "服务类型")
    private ServiceTypeEnum type;
}
