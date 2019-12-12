package com.practice.springbootfilterapp.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author Shivam Gupta
 */
@Component
public class ExternalUserLoginFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(ExternalUserLoginFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.error("In ExternalUserLoginFilter");
        chain.doFilter(request, response);
    }

    @Bean
    public FilterRegistrationBean<ExternalUserLoginFilter> externalUserLoginFilterRegistrationBean() {
        FilterRegistrationBean<ExternalUserLoginFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new ExternalUserLoginFilter());
        registrationBean.addUrlPatterns("/external/**");
        return registrationBean;
    }
}
