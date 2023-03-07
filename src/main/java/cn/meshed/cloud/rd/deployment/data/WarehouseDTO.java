package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.WarehouseAccessModeEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseRelationEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseRepoTypeEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseStatusEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehousePurposeTypeEnum;
import com.alibaba.cola.dto.DTO;
import lombok.Data;

/**
 * <h1>仓库传输数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class WarehouseDTO extends DTO {

    /**
     * uuid
     */
    private String uuid;

    /**
     * 中文名称
     */
    private String name;

    /**
     * 仓库名称
     */
    private String repoName;

    /**
     * 仓库存储类型（代码仓库）：云效/github/gitee
     */
    private WarehouseRepoTypeEnum repoType;

    /**
     * 仓库地址
     */
    private String repoUrl;

    /**
     * 仓库目的类型（管理仓库）: 服务/客户端/组件/前端
     */
    private WarehousePurposeTypeEnum purposeType;

    /**
     * 仓库系统关系：自建/登记/导入
     */
    private WarehouseRelationEnum relation;

    /**
     * 仓库版本号
     */
    private String version;

    /**
     * 仓库负责人ID
     */
    private Long owner;

    /**
     * 仓库状态
     */
    private WarehouseStatusEnum status;

}
