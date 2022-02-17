package com.rr.config.web;

import com.rr.web.model.TestFilter;
import com.rr.web.model.TestListener;
import com.rr.web.model.TestServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class TestConfig {
    @Bean
    public ServletRegistrationBean getServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new TestServlet(),"/testServlet");
        return bean;
    }
    @Bean
    public FilterRegistrationBean getFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new TestFilter());
        return bean;
    }
    @Bean
    public ServletListenerRegistrationBean getListener(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new TestListener());
        return bean;
    }
    public void addInterceptors(){

    }
}
