package com.blog.personalblog.config;


import com.blog.personalblog.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by sunheng on 2019/8/6
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    /*@Override

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**").excludePathPatterns("/sysdeal/login","/login", "/static/**");
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/one/**").excludePathPatterns("/sysdeal/login","/login", "/static/**")
        .addPathPatterns("/two/**");
        //WebMvcConfigurer.super.addInterceptors(registry);

    }

    @Override

    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

        WebMvcConfigurer.super.addResourceHandlers(registry);

    }*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myAuthenticationInterceptor())
                .addPathPatterns("/*/**");
    }
    @Bean
    public AuthenticationInterceptor myAuthenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
}
