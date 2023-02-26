package cn.meshed.cloud.rd.deployment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>来源类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum WarehouseSourceType {

    /**
     * 云效仓库 系统研发默认方案
     */
    CODEUP(1,"codeup"),

    /**
     * github
     */
    GITHUB(2,"github"),
    /**
     * gitee
     */
    GITEE(2,"gitee"),
    /**
     * gitlab
     */
    GITLAB(2,"gitlab"),
    /**
     * coding
     */
    CODING(3,"coding"),
    ;

    private final int value;
    private final String key;
}
