package id.bootcamp.java310.pos.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImageConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String absolutePath = new FileSystemResource("").getFile().getAbsolutePath();
		absolutePath += "\\uploads\\";
		
		registry.addResourceHandler("/images/**").addResourceLocations("file:///"+absolutePath);
		
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
	
}
