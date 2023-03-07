package cn.meshed.cloud.rd.deployment.command;

import cn.meshed.cloud.rd.deployment.enums.WarehousePurposeTypeEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseRepoTypeEnum;
import com.alibaba.cola.dto.Command;
import lombok.Data;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class WarehouseAddCmd extends Command {

    /**
     * 项目标识
     */
    private String projectKey;

    /**
     * 中文名称
     */
    private String name;

    /**
     * 仓库名称
     */
    private String repoName;

    /**
     * 仓库目的类型（管理仓库）: 服务/客户端/组件/前端
     */
    private WarehousePurposeTypeEnum purposeType;

    /**
     * 仓库描述
     */
    private String description;

    /**
     * 引擎模板 具体的模板
     */
    private String engineTemplate;
}
