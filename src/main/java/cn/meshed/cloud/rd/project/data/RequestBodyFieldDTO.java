package cn.meshed.cloud.rd.project.data;

import lombok.Data;

/**
 * <h1>请求Body字段模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class RequestBodyFieldDTO extends BaseFieldDTO{
    /**
     * 不能为空
     */
    private boolean nonNull;
}
