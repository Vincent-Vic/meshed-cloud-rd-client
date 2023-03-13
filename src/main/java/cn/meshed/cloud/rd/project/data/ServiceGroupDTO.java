package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;

/**
 * <h1>服务分组</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
public class ServiceGroupDTO {

    /**
     * uuid
     */
    private String uuid;

    /**
     * 服务分组名称
     */
    private String name;

    /**
     * 服务分组uri
     */
    private String uri;

    /**
     * 服务映射类名
     */
    private String className;

    /**
     * 服务分组包名
     */
    private String packageName;

    /**
     * 服务分组版本号
     */
    private String version;

    /**
     * 服务分组所属领域key
     */
    private String domain;

    /**
     * 模型分组所属项目key
     */
    private String projectKey;

    /**
     * 服务分组描述
     */
    private String description;

    /**
     * 服务类型
     */
    private ServiceTypeEnum type;
}
