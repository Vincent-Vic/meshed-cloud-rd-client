package cn.meshed.cloud.rd.deployment.data;

import com.alibaba.cola.dto.DTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>版本统计数据模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "版本统计数据模型")
public class VersionReleaseCountDTO extends DTO {
}
