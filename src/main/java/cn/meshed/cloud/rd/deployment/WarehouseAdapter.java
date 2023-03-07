package cn.meshed.cloud.rd.deployment;

import cn.meshed.cloud.rd.deployment.command.WarehouseAddCmd;
import cn.meshed.cloud.rd.deployment.command.WarehouseImportCmd;
import cn.meshed.cloud.rd.deployment.data.WarehouseDTO;
import cn.meshed.cloud.rd.deployment.query.WarehousePageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
     *
     * @param projectKey       项目key
     * @param warehousePageQry 仓库分页查询
     * @return
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<WarehouseDTO> list(@ApiParam("项目key") @Valid @PathVariable("projectKey") String projectKey, @Valid WarehousePageQry warehousePageQry);

    /**
     * 新增仓库
     *
     * @param warehouseAddCmd 仓库新增参数
     * @return {@link Response}
     */
    @PostMapping("/add")
    Response add(@RequestBody WarehouseAddCmd warehouseAddCmd);

    /**
     * 注册信息/导入仓库
     *
     * @param warehouseImportCmd 仓库登记/导入功能
     * @return {@link Response}
     */
    @PostMapping("/import")
    Response warehouseImport(@RequestBody WarehouseImportCmd warehouseImportCmd);
}
