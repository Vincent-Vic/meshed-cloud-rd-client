package cn.meshed.cloud.rd.deployment;

import cn.meshed.cloud.rd.deployment.data.VersionDTO;
import cn.meshed.cloud.rd.deployment.data.WarehouseDTO;
import cn.meshed.cloud.rd.deployment.query.VersionQry;
import cn.meshed.cloud.rd.deployment.query.WarehouseQry;
import com.alibaba.cola.dto.PageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>仓库适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/warehouse")
public interface WarehouseAdapter {

    /**
     * 仓库列表
     * @param projectKey
     * @param warehouseQry
     * @return
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<WarehouseDTO> list(@PathVariable("projectKey") String projectKey, @Valid WarehouseQry warehouseQry);
}
