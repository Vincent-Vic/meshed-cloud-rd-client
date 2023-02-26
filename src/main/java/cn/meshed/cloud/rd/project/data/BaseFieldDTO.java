package cn.meshed.cloud.rd.project.data;

import com.alibaba.cola.dto.DTO;
import lombok.Data;

/**
 * <h1>基础字段传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class BaseFieldDTO extends DTO {

    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 字段类型
     */
    private String fieldType;
    /**
     * 泛型
     */
    private String generic;
    /**
     * 描述
     */
    private String explain;
}
