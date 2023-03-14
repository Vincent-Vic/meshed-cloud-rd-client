package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.WarehouseAccessModeEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>仓库传输数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "仓库详情传输数据模型")
public class WarehouseDetailDTO extends DTO {

    /**
     * 仓库访问模式
     */
    private WarehouseAccessModeEnum accessMode;

    /**
     * 仓库所属项目唯一标识
     */
    private String projectKey;

    /**
     * 仓库描述
     */
    private String description;


}
