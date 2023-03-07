package cn.meshed.cloud.rd.deployment;

import cn.meshed.cloud.rd.deployment.data.VersionDTO;
import cn.meshed.cloud.rd.deployment.query.VersionPageQry;
import com.alibaba.cola.dto.PageResponse;
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
     * @param projectKey     项目key
     * @param versionPageQry 版本分页查询
     * @return
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<VersionDTO> list(@PathVariable("projectKey") String projectKey, @Valid VersionPageQry versionPageQry);
}
