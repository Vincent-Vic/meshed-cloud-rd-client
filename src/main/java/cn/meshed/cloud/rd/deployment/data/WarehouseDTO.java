package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.WarehouseSourceType;
import cn.meshed.cloud.rd.deployment.enums.WarehouseStatus;
import cn.meshed.cloud.rd.deployment.enums.WarehouseType;
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
     * id
     */
    private Long id;
    /**
     * 版本项目名称
     */
    private String name;
    /**
     * 版本项目全称代号
     */
    private String enname;
    /**
     * 版本
     */
    private String version;
    /**
     * 仓库地址
     */
    private String url;
    /**
     * 仓库来源类型
     */
    private WarehouseSourceType sourceType;
    /**
     * 仓库来源类型
     */
    private WarehouseType type;
    /**
     * 仓库来源类型
     */
    private WarehouseStatus status;

}
