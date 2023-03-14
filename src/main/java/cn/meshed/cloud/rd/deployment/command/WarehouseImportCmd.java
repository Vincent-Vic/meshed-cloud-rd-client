package cn.meshed.cloud.rd.deployment.command;

import cn.meshed.cloud.rd.deployment.enums.WarehousePurposeTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>逻辑仓库导入</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "逻辑仓库导入")
public class WarehouseImportCmd extends Command {

    /**
     * 项目标识
     */
    private String projectKey;

    /**
     * 仓库地址
     */
    private String repoUrl;

    /**
     * 源仓库的授权码
     */
    private String accessToken;

    /**
     * 仓库目的类型（管理仓库）: 服务/客户端/组件/前端
     */
    private WarehousePurposeTypeEnum purposeType;

    /**
     * 仓库描述
     */
    private String description;
}
