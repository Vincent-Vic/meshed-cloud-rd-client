package cn.meshed.cloud.rd.deployment.query;

import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1>版本发布查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class VersionReleaseCountQry extends Query {
    /**
     * 项目key
     */
    private String projectKey;
}
