package cn.meshed.cloud.rd.deployment.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>版本状态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum VersionStatusEnum {
    /**
     * 版本提交信息
     */
    SUBMIT(1, "submit"),
    /**
     * 代码构建（已推送仓库中）
     */
    BUILDING(2, "building"),
    /**
     * 代码构建失败
     */
    BUILD_FAILED(2, "build_failed"),
    /**
     * 已部署
     */
    DEPLOYMENT(2, "deploying"),
    /**
     * 部署失败
     */
    DEPLOYMENT_FAILED(2, "deployment_failed"),
    ;

    private final int value;
    private final String key;
}
