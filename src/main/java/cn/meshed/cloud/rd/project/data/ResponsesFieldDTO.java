package cn.meshed.cloud.rd.project.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>相应字段模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "响应字段模型")
public class ResponsesFieldDTO extends BaseFieldDTO {

}
