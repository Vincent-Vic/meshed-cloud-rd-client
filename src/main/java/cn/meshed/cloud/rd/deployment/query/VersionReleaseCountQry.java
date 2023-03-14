package cn.meshed.cloud.rd.deployment.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>版本发布查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "版本发布查询模型")
public class VersionReleaseCountQry extends Query {
    /**
     * 项目唯一标识
     */
    private String projectKey;
}
