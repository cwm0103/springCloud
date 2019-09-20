package com.cucheng.order.confing;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author ：cwm
 * @date ：Created in 2019/7/7 14:54
 * @description：测试配置文件
 * @modified By：
 * @version: 1.0$
 */
@Data
@Slf4j
@Component
@ConfigurationProperties(value = "bory")
@RefreshScope
public class boryConfig {
    private String name;
    private int age;
}
