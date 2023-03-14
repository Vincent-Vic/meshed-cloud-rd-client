package cn.meshed.cloud.rd.deployment.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <h1>版本操作数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */

@EqualsAndHashCode(callSuper = false)
@Data
@Schema(title = "版本操作数据")
public class VersionCmd extends Command {

    private static final long serialVersionUID = 1L;


}
