package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.OperateEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ModelByOneQry extends Query {
    /**
     * uuid
     */
    private String uuid;
    /**
     * 项目key
     */
    private String projectKey;
    /**
     * 操作类型
     */
    private OperateEnum operate;
    /**
     * 类型
     */
    private ServiceTypeEnum type;
}
