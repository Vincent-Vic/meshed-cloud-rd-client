package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import com.alibaba.cola.dto.Query;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ModelByEnnameQry extends Query {
    /**
     * className
     */
    private String enname;
    /**
     * 类型
     */
    private ModelTypeEnum type;
    /**
     * 项目key
     */
    private String projectKey;

}
