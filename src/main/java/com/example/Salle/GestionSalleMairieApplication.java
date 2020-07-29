package com.example.Salle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class}) 
public class GestionSalleMairieApplication {


	
	public static void main(String[] args) {
		SpringApplication.run(GestionSalleMairieApplication.class, args);
	}

	
	
	@Configuration
	public class AdditionalResourceWebConfiguration implements WebMvcConfigurer {

	  @Override
	  public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/Images/**").addResourceLocations("file://" + System.getProperty("user.dir") + "/src/main/Images/");
	  }
	}

	 @Bean
	    public WebMvcConfigurer configure() {
		   
		         return new WebMvcConfigurer() {
		        	 @Override
		        	 public void addCorsMappings(CorsRegistry registry) {
		        		 registry.addMapping("/*").allowedOrigins("http://localhost:4200");
		        	 }
			  
		         };
		
		 }
	
	 }


     
   
  

