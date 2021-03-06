package com.smxy.campus_recruit.config;

import com.smxy.campus_recruit.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张伟杰
 * @ClassName MyMVCConfig.java
 * @Description TODO
 * @createTime 2021年07月05日 17:17:00
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截的地址
        List<String> addPath = new ArrayList<>();
        addPath.add("/userstu/**");
        addPath.add("/userep/**");
        // 设置不拦截地址
        List<String> excludePath = new ArrayList<>();
        excludePath.add("/userstu/login");
        excludePath.add("/userep/login");

        // 配置拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPath)
                .excludePathPatterns(excludePath);
    }


    /**
     * 解决跨域问题
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*").allowedMethods("*")
                .allowedOrigins("*").allowCredentials(true);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/file/**").addResourceLocations("file:" + "D:/test/");
    }

}
