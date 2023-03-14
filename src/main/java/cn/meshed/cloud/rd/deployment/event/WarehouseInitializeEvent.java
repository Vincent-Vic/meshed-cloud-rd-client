package cn.meshed.cloud.rd.deployment.event;

import cn.meshed.cloud.dto.SecurityEvent;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>仓库信息创建完成后初始化事件</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "仓库信息创建完成后初始化事件")
public class WarehouseInitializeEvent extends SecurityEvent {
    /**
     * 项目标识
     */
    private String projectKey;

    /**
     * 仓库ID
     */
    private String repositoryId;

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
