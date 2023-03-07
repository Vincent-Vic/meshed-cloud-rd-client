package cn.meshed.cloud.rd.project;

import cn.meshed.cloud.rd.project.command.DomainCmd;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * <h1>领域适配器</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@RequestMapping("/domain")
public interface DomainAdapter {

    /**
     * 领域统计
     * @param projectKey 项目key
     * @return {@link SingleResponse<List<String>>}
     */
    @GetMapping("/select/{projectKey}")
    SingleResponse<List<String>> select(@PathVariable("projectKey") String projectKey);

    /**
     * 领域统计
     * @param domainCmd 项目key
     * @return {@link Response}
     */
    @PostMapping("/add")
    Response add(@Valid DomainCmd domainCmd);


}
