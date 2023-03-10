package cn.meshed.cloud.rd.project.data;

import lombok.Data;

/**
 * <h1>请求参数字段模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class RequestFieldDTO extends BaseFieldDTO{

    /**
     * 模拟数据
     */
    private String mock;
    /**
     * 规则 json
     */
    private String rule;
    /**
     * 不能为空
     */
    private boolean nonNull;
}
