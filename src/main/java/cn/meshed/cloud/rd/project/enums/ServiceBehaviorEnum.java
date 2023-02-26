package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>服务作用枚举</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ServiceBehaviorEnum {
    /**
     * Get类型
     */
    QRY(1,"Qry"),
    /**
     * Get类型
     */
    CMD(2,"Cmd"),
    /**
     * Get类型
     */
    PAGE(3,"PageQry"),

    ;

    private final int value;
    private final String key;
}
