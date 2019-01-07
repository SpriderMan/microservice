package com.weimai.mvc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;
import java.nio.charset.Charset;
import java.util.List;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    private final static Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       //  registry.addInterceptor(new MyHandlerInterceptor());
        super.addInterceptors(registry);
    }


}
