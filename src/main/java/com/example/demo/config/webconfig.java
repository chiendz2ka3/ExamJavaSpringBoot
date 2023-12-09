package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class webconfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        System.out.println(" da log duoc vao ham");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/"); // Location of your JSP files
        resolver.setSuffix(".jsp");
        System.out.println(resolver.toString());
        return resolver;
    }
}
