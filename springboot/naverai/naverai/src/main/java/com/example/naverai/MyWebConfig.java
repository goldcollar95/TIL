package com.example.naverai;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //설정 xml 파일 대신
public class MyWebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/upload/**").addResourceLocations
		("file:///c:/upload/");
		registry.addResourceHandler("/naverai/**").addResourceLocations
		("file:///" + NaverInform.path);
		//http://localhost:8082/naverai/xxxx
	}
	

}
