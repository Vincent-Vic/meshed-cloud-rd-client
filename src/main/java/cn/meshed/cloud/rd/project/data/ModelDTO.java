package cn.meshed.cloud.rd.project.data;

import cn.meshed.cloud.rd.project.enums.ModelTypeEnum;
import cn.meshed.cloud.rd.project.enums.ReleaseStatusEnum;
import cn.meshed.cloud.rd.project.enums.ServiceModelStatusEnum;
import com.alibaba.cola.dto.DTO;
import lombok.Data;

/**
 * <h1>模型传输模型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
public class ModelDTO extends DTO {
    /**
     * uuid
     */
    private String uuid;
    /**
     * 模型中文名
     */
    private String name;
    /**
     * 模型实体类名
     */
    private String className;
    /**
     * 版本
     */
    private String version;
    /**
     * 领域
     */
    private String domain;
    /**
     * 类型
     */
    private ModelTypeEnum type;
    /**
     * 模型作用
     */
    private ServiceModelStatusEnum status;

    /**
     * 版本状态
     */
    private ReleaseStatusEnum releaseStatus;

}
