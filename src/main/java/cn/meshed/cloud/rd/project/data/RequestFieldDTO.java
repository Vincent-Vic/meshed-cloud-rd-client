package cn.meshed.cloud.rd.project.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>请求参数字段模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "请求参数字段模型")
public class RequestFieldDTO extends BaseFieldDTO {

    /**
     * 模拟数据
     */
    @Schema(description = "模拟数据")
    private String mock;
    /**
     * 规则 json
     */
    @Schema(description = "规则(JSON格式)")
    private String rule;
    /**
     * 不能为空
     */
    @Schema(description = "不能为空")
    private boolean nonNull;
}
