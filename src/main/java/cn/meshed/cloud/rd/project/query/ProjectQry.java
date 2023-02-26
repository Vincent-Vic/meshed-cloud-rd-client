package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectVisitTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import lombok.Data;

/**
 * <h1>项目查询对象</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ProjectQry extends PageQuery {

    /**
     * 关键字
     */
    private String keyword;
    /**
     * 类型
     */
    private ProjectTypeEnum type;
    /**
     * 级别
     */
    private ProjectAccessModeEnum accessMode;
    /**
     * 访问类型
     */
    private ProjectVisitTypeEnum visitType;
}
