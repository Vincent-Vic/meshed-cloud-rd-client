package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1>方法查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ServiceByClassNameQry extends Query {
    /**
     * 类型
     */
    private ServiceTypeEnum type;
    /**
     * 控制器
     */
    private String control;
    /**
     * 项目key
     */
    private String projectKey;

}
