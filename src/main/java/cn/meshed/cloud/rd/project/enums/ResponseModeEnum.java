package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>请求参数模式</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ResponseModeEnum {
    /**
     * 单参数
     */
    SINGLE(1,"single"),
    /**
     * 合并
     */
    MERGE(2,"merge"),
    /**
     * 分页
     */
    PAGE(3,"page"),

    ;

    private final int value;
    private final String key;
}
