package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ModelCmd;
import cn.meshed.cloud.rd.project.data.ModelDTO;
import cn.meshed.cloud.rd.project.data.ModelDetailDTO;
import cn.meshed.cloud.rd.project.query.ModelByEnnameQry;
import cn.meshed.cloud.rd.project.query.ModelByOneQry;
import cn.meshed.cloud.rd.project.query.ModelPageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * <h1>数据模型适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/model")
public interface ModelAdapter {

    /**
     * 列表
     *
     * @param modelPageQry 模型分页查询
     * @return {@link PageResponse<ModelDTO>}
     */
    @GetMapping("/list/{projectKey}")
    PageResponse<ModelDTO> list(@PathVariable("projectKey") String projectKey, @Valid ModelPageQry modelPageQry);

    /**
     * 详情
     *
     * @param uuid 项目key
     * @return {@link SingleResponse<ModelDetailDTO>}
     */
    @GetMapping("/details/{uuid}")
    SingleResponse<ModelDetailDTO> details(@PathVariable("uuid") String uuid, @Valid ModelByOneQry modelByOneQry);

    /**
     * 保存功能
     *
     * @param modelCmd 服务数据
     * @return {@link Response}
     */
    @PostMapping("/save")
    Response save(@Valid ModelCmd modelCmd);

    /**
     * 检查英文名是否合法
     *
     * @param modelByEnnameQry 检查参数
     * @return {@link Response}
     */
    @GetMapping("/check/enname")
    Response checkEnname(@Valid ModelByEnnameQry modelByEnnameQry);

}
