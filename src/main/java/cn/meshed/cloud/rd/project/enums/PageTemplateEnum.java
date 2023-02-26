package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>前端页面模板枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum PageTemplateEnum {
    /**
     * 无
     */
    NONE(0,"none"),
    /**
     * Ant Design Pro
     */
    ANT_DESIGN_PRO(1,"ant_design_pro"),

    ;

    private final int value;
    private final String key;
}
