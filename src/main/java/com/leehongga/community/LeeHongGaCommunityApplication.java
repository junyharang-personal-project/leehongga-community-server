package com.leehongga.community;

import com.leehongga.community.config.logback.filters.LogbackMdcFilter;
import com.leehongga.community.config.logback.filters.MultiReadableHttpServletRequestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LeeHongGaCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeeHongGaCommunityApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean multiReadableHttpServletRequestFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        MultiReadableHttpServletRequestFilter multiReadableHttpServletRequestFilter = new MultiReadableHttpServletRequestFilter();
        registrationBean.setFilter(multiReadableHttpServletRequestFilter);
        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean logbackMdcFilterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        LogbackMdcFilter logbackMdcFilter = new LogbackMdcFilter();
        registrationBean.setFilter(logbackMdcFilter);
        registrationBean.setOrder(2);
        return registrationBean;
    }
}
