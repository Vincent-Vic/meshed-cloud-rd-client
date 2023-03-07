package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.VersionStatusEnum;
import cn.meshed.cloud.rd.deployment.enums.VersionTypeEnum;
import com.alibaba.cola.dto.DTO;
import lombok.Data;

/**
 * <h1>版本传输数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class VersionDTO extends DTO {
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
     * 版本类型
     */
    private VersionTypeEnum type;
    /**
     * 版本状态
     */
    private VersionStatusEnum status;


}
