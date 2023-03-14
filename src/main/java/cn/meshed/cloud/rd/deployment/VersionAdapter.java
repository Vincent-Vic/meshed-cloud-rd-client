package cn.meshed.cloud.rd.deployment;

import cn.meshed.cloud.rd.deployment.data.VersionDTO;
import cn.meshed.cloud.rd.deployment.query.VersionPageQry;
import com.alibaba.cola.dto.PageResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>版本适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/version")
public interface VersionAdapter {

    /**
     * 版本列表
     *
     * @param projectKey     项目唯一标识
     * @param versionPageQry 版本分页查询
     * @return
     */
    @Operation(summary = "版本列表")
    @GetMapping("/list/{projectKey}")
    PageResponse<VersionDTO> list(@Parameter(description = "") @PathVariable("projectKey") String projectKey, @Valid VersionPageQry versionPageQry);
}
