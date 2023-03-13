package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.ServiceCmd;
import cn.meshed.cloud.rd.project.command.ServiceGroupCmd;
import cn.meshed.cloud.rd.project.data.ServiceDTO;
import cn.meshed.cloud.rd.project.data.ServiceDetailDTO;
import cn.meshed.cloud.rd.project.data.ServiceGroupDTO;
import cn.meshed.cloud.rd.project.data.ServiceReleaseCountDTO;
import cn.meshed.cloud.rd.project.query.ServiceByClassNameQry;
import cn.meshed.cloud.rd.project.query.ServiceByMethodQry;
import cn.meshed.cloud.rd.project.query.ServiceByOneQry;
import cn.meshed.cloud.rd.project.query.ServicePageQry;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * <h1>服务适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/service/group")
public interface ServiceGroupAdapter {

    /**
     * 服务分组选择获取
     * @param projectKey 项目key
     * @return {@link SingleResponse< List <ServiceGroupDTO>>}
     */
    @GetMapping("/select/{projectKey}")
    SingleResponse<List<ServiceGroupDTO>> select(@PathVariable("projectKey") String projectKey);

    /**
     * 保存功能
     *
     * @param serviceGroupCmd 服务分组数据
     * @return {@link Response}
     */
    @PostMapping("/save")
    Response save(@Valid @RequestBody ServiceGroupCmd serviceGroupCmd);

    /**
     * 检查方法是否可用（控制器中唯一性）
     *
     * @param serviceByClassNameQry 检查参数
     * @return {@link Response}
     */
    @GetMapping("/check/method")
    Response checkClassName(@Valid ServiceByClassNameQry serviceByClassNameQry);

}
