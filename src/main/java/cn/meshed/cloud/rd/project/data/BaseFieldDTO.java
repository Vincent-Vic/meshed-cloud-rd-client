package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.BaseGenericsEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>基础字段传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "基础字段传输模型")
public class BaseFieldDTO extends DTO {

    /**
     * 字段名称
     */
    @Schema(description = "字段名称")
    private String fieldName;
    /**
     * 字段类型
     */
    @Schema(description = "字段类型")
    private String fieldType;
    /**
     * 泛型
     */
    @Schema(description = "字段类型")
    private BaseGenericsEnum generic;
    /**
     * 描述
     */
    @Schema(description = "字段类型")
    private String explain;
}
