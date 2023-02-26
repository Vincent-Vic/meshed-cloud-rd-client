package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>服务模板枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ServiceTemplateEnum {

    /**
     * 无
     */
    NONE(0,"none"),
    /**
     * COLA架构
     */
    COLA(1,"cola"),
    /**
     * 三层架构
     */
    MVC(2,"mvc"),

    ;

    private final int value;
    private final String key;
}
