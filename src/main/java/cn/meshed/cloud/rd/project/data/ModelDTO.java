package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceModelStatusEnum;
import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>模型传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "模型传输模型")
public class ModelDTO extends DTO {
    /**
     * uuid
     */
    @Schema(title = "通用唯一编码")
    private String uuid;
    /**
     * 模型中文名
     */
    @Schema(title = "模型中文名")
    private String name;
    /**
     * 模型实体类名
     */
    @Schema(title = "模型实体类名")
    private String className;
    /**
     * 版本
     */
    @Schema(title = "版本")
    private String version;
    /**
     * 领域
     */
    @Schema(title = "领域")
    private String domain;
    /**
     * 类型
     */
    @Schema(title = "模型类型")
    private ModelTypeEnum type;
    /**
     * 模型状态
     */
    @Schema(title = "模型状态")
    private ServiceModelStatusEnum status;

    /**
     * 版本状态
     */
    @Schema(title = "版本状态")
    private ReleaseStatusEnum releaseStatus;

}
