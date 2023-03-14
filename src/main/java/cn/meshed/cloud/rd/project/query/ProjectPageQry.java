package cn.meshed.cloud.rd.project.query;

import cn.meshed.cloud.rd.project.enums.ProjectAccessModeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import cn.meshed.cloud.rd.project.enums.ProjectVisitTypeEnum;
import com.alibaba.cola.dto.PageQuery;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>项目分页查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "项目分页查询参数")
public class ProjectPageQry extends PageQuery {

    /**
     * 关键字
     */
    @Schema(title = "关键字")
    private String keyword;
    /**
     * 类型
     */
    @Schema(title = "项目类型")
    private ProjectTypeEnum type;
    /**
     * 授权模式
     */
    @Schema(title = "授权模式")
    private ProjectAccessModeEnum accessMode;
    /**
     * 访问类型
     */
    @Schema(title = "访问类型")
    private ProjectVisitTypeEnum visitType;
}
