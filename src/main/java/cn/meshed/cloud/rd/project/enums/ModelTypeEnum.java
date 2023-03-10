package cn.meshed.cloud.rd.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>模型类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ModelTypeEnum {

    /**
     *操作模型
     */
    COMMAND(1,"Cmd"),
    /**
     *查询模型
     */
    QUERY(2,"Qry"),
    /**
     *数据模型
     */
    DTO(3,"DTO"),
    /**
     *枚举模型
     */
    ENUMS(4,"Enum"),
    /**
     *事件模型
     */
    EVENT(5,"Event"),
    /**
     * 服务参数类型
     */
    SERVICE_PARAM(6,"service_param"),

    ;

    private final int value;
    private final String key;
}
