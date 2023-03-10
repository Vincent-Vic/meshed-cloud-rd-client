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
public enum RequestModeEnum {
    /**
     * 查询
     */
    FORM(1,"form"),
    /**
     * 操作
     */
    JSON(2,"json"),
    /**
     * 分页
     */
    PAGE(3,"page"),

    ;

    private final int value;
    private final String key;
}
