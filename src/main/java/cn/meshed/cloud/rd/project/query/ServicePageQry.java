package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import com.alibaba.cola.dto.PageQuery;
import lombok.Data;

/**
 * <h1>项目查询对象</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ServicePageQry extends PageQuery {

    /**
     * 项目key
     */
    private String projectKey;
    /**
     * 关键字
     */
    private String keyword;
    /**
     * 类型
     */
    private ProjectTypeEnum type;
    /**
     * 发行状态
     */
    private ReleaseStatusEnum releaseStatus;
}
