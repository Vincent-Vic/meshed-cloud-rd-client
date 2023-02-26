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
     * 字段列表
     */
    private List<RequestParamFieldDTO> fields;
}
