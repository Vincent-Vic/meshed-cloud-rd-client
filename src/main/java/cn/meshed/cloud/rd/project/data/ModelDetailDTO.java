package cn.meshed.cloud.rd.project.data;

import lombok.Data;

import java.util.List;

/**
 * <h1>模型传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ModelDetailDTO extends ModelDTO{

    /**
     * 模型英文名
     */
    private String enname;
    /**
     * 模型实体父类名称
     */
    private String superClass;
    /**
     * 详情
     */
    private String description;
    /**
     * 字段列表
     */
    private List<RequestFieldDTO> fields;
}
