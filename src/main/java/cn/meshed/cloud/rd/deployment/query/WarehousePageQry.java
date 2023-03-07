package cn.meshed.cloud.rd.deployment.query;

import com.alibaba.cola.dto.PageQuery;
import lombok.Data;

/**
 * <h1>仓库分页查询模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class WarehousePageQry extends PageQuery {
    /**
     * 项目key
     */
    private String projectKey;
}
