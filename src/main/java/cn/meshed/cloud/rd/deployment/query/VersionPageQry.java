package cn.meshed.cloud.rd.deployment.query;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>版本分页查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "版本分页查询模型")
public class VersionPageQry extends PageQuery {
    /**
     * 项目唯一标识
     */
    private String projectKey;
}
