package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceModelStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceTypeEnum;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ServiceDTO {

    /**
     * uuid
     */
    private String uuid;
    /**
     * 模型中文名
     */
    private String name;
    /**
     * 接口
     */
    private String api;
    /**
     * 版本
     */
    private String version;

    /**
     * 类型
     */
    private ServiceTypeEnum type;

    /**
     * 模型作用
     */
    private ServiceModelStatusEnum status;

    /**
     * 版本状态
     */
    private ReleaseStatusEnum releaseStatus;


}
