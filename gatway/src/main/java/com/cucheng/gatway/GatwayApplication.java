package com.cucheng.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

@SpringBootApplication
@EnableZuulProxy
public class GatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatwayApplication.class, args);
    }

    /**
     * 动态路由的配置
     * @return
     */
    @ConfigurationProperties("zuul")
    @RefreshScope
    public ZuulProperties zuulProperties()
    {
        return new ZuulProperties();
    }
}
