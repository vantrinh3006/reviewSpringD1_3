package com.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration //cơ chế DI IOC
@ComponentScans({@ComponentScan(value = "com.example.*")})
public class ApplicationContextConfig {

	@Bean(name = "viewResolver") //tương ứng là 1 object (is an object)
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

//    @Bean(name = "multipartResolver")
//    public MultipartResolver getMultipartResolver() {
//        CommonsMultipartResolver resover = new CommonsMultipartResolver();
//        // 1MB
//        resover.setMaxUploadSize(1 * 1024 * 1024);
//
//        return resover;
//    }

    @Bean(name = "viewResolverTiles")
    public ViewResolver getViewResolverTitles(){
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(TilesView.class);
        viewResolver.setOrder(0);
        return viewResolver;
    }


    @Bean(name = "tilesConfigurer")
    public TilesConfigurer getTilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions("/teamplate/tiles-blog.xml");
        return tilesConfigurer;
    }
}