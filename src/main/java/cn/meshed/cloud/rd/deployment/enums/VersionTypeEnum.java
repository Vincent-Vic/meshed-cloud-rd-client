package cn.meshed.cloud.rd.deployment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>版本类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum VersionTypeEnum {
    /**
     * 制品库
     */
    MAVEN(1,"maven"),
    /**
     * 镜像
     */
    IMAGES(2,"images"),

    ;

    private final int value;
    private final String key;
}
