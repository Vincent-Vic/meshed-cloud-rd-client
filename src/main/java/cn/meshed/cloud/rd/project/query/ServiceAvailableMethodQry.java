package cn.meshed.cloud.rd.project.query;

import com.alibaba.cola.dto.Query;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>方法查询参数</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "方法查询参数")
public class ServiceAvailableMethodQry extends Query {
    /**
     * method
     */
    @NotBlank(message = "方法名称不能为空")
    private String method;
    /**
     * 服务分组编码
     */
    @NotBlank(message = "分组编码不能为空")
    private String groupId;

}
