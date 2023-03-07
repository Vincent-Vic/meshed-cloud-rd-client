package cn.meshed.cloud.rd.deployment.event;

import cn.meshed.cloud.dto.SecurityEvent;
import lombok.Data;

/**
 * <h1>仓库信息创建完成后初始化事件</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class WarehouseInitializeEvent extends SecurityEvent {
    /**
     * 项目标识
     */
    private String projectKey;

    /**
     * 仓库ID
     */
    private Long repositoryId;

    /**
     * 仓库名称
     */
    private String repositoryName;

    /**
     * 引擎模板 具体的模板
     */
    private String engineTemplate;

    /**
     * basePackage java 项目需要
     */
    private String basePackage;
}
