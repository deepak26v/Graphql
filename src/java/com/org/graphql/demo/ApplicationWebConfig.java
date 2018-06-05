package com.org.graphql.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by deepakvalechha on 05/06/18.
 */
@Configuration
public class ApplicationWebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/graphiql").setViewName("forward:/graphiql/index.html");
    }
}
