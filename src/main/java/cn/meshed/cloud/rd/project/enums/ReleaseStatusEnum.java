package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>Jar 发行状态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ReleaseStatusEnum {


    /**
     *操作模型
     */
    EDIT(1,"edit"),
    /**
     *操作模型
     */
    PROCESSING(2,"processing"),
    /**
     *操作模型
     */
    REJECT(3,"reject"),
    /**
     *操作模型
     */
    RELEASE(4,"release"),

    ;

    private final int value;
    private final String key;

}
