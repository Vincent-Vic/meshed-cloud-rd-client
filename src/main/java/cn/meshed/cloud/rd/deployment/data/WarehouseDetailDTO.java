package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.WarehouseAccessModeEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehousePurposeTypeEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseRelationEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseRepoTypeEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehouseStatusEnum;
import com.alibaba.cola.dto.DTO;
import lombok.Data;

/**
 * <h1>仓库传输数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class WarehouseDetailDTO extends DTO {

    /**
     * 仓库访问模式
     */
    private WarehouseAccessModeEnum accessMode;

    /**
     * 仓库所属项目key
     */
    private String projectKey;

    /**
     * 仓库描述
     */
    private String description;


}
