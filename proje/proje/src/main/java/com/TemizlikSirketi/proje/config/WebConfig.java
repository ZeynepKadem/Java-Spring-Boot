package com.TemizlikSirketi.proje.config;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	  
	  @Override
	  public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**").allowedOrigins("http://localhost:5500");
	    }
	    public void addViewControllers(ViewControllerRegistry registry)
	    {
	        registry.addViewController("/").setViewName("Welcome");
	        registry.addViewController("/login").setViewName("login");
	         registry.addViewController("/login/postlogin").setViewName("login");
	         registry.addViewController("/login/Authorization").setViewName("authErrorPage");
	        //registry.addViewController("/home").setViewName("userhome");
	        registry.addViewController("/admin/getCreateHome").setViewName("homeEditPage");
	        registry.addViewController("/admin/getHome").setViewName("index");
	        registry.addViewController("/admin/getAdmin").setViewName("homeIndexPage");
	        registry.addViewController("/employe/getEmploye").setViewName("employeIndexPage");
	        registry.addViewController("/employe/getWelcome").setViewName("Welcome");
	        registry.addViewController("/employe/getPlanOut").setViewName("employeIndexPage");
	     }

	    @Override
	    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
	        converters.add(stringHttpMessageConverter);
	    }

	    @Override
	    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
	        configurer.favorPathExtension(false);
	    }

}
