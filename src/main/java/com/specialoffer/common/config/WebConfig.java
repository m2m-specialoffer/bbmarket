package com.specialoffer.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
/*
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		registry.jsp("/WEB-INF/", ".jsp");
	}
*/

	@Bean
	public ViewResolver customVewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/");
		internalResourceViewResolver.setSuffix(".jsp");
		
		return internalResourceViewResolver;
	}
/*
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }
*/
}
