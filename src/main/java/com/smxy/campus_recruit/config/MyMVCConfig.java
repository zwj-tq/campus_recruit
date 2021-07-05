package com.smxy.campus_recruit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 张伟杰
 * @ClassName MyMVCConfig.java
 * @Description TODO
 * @createTime 2021年07月05日 17:17:00
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {
    /**
     * 解决跨域问题
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*").allowedMethods("*")
                .allowedOrigins("*").allowCredentials(true);
    }
}
