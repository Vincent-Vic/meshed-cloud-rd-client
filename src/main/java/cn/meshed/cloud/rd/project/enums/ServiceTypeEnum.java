package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ServiceTypeEnum {
    /**
     * RESTful类型
     */
    API(1,"Adapter"),
    /**
     *dubbo类型
     */
    RPC(2,"Rpc"),
    /**
     *sdk类型
     */
    SDK(3,"Handler"),
    ;

    private final int value;
    private final String key;
}
