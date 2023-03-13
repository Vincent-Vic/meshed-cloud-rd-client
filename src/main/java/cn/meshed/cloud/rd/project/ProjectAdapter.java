package cn.meshed.cloud.rd.project;


import cn.meshed.cloud.rd.project.command.ProjectChangeCmd;
import cn.meshed.cloud.rd.project.command.ProjectCmd;
import cn.meshed.cloud.rd.project.data.ProjectDTO;
import cn.meshed.cloud.rd.project.data.ProjectDetailDTO;
import cn.meshed.cloud.rd.project.enums.ProjectTypeEnum;
import cn.meshed.cloud.rd.project.query.ProjectPageQry;
import cn.meshed.cloud.rd.project.query.ServiceByMethodQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>项目适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/project")
public interface ProjectAdapter {

    /**
     * 列表
     *
     * @param projectPageQry 项目分页查询
     * @return {@link PageResponse<ProjectDTO>}
     */
    @ApiOperation(value = "列表")
    @GetMapping("/list")
    PageResponse<ProjectDTO> list(@Valid ProjectPageQry projectPageQry);

    /**
     * 详情
     *
     * @param projectKey 项目key
     * @return {@link SingleResponse<ProjectDetailDTO>}
     */
    @GetMapping("/details/{projectKey}")
    SingleResponse<ProjectDetailDTO> details(@PathVariable("projectKey") String projectKey);

    /**
     * 保存功能
     *
     * @param projectCmd 项目数据
     * @return {@link Response}
     */
    @ApiOperation(value = "新增项目")
    @PostMapping("/save")
    Response save(@Valid  @RequestBody ProjectCmd projectCmd);

    /**
     * 变更项目
     *
     * @param type 变更行为： 下线，删除,废弃
     * @param uuid uuid
     * @return {@link Response}
     */
    @PostMapping("/change/{type}/{uuid}")
    Response change(@PathVariable("type") ProjectTypeEnum type, @PathVariable("uuid") String uuid, @Valid  @RequestBody ProjectChangeCmd projectChangeCmd);

    /**
     * 检查key是否唯一性
     *
     * @param key key
     * @return {@link Response}
     */
    @GetMapping("/check/key/{key}")
    Response checkKey(@PathVariable("key") String key);

}
