package com.perandr.websocketspoc;

//import com.perandr.websocketspoc.config.AppConfig;
//import com.perandr.websocketspoc.config.Services;
import com.perandr.websocketspoc.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Import({AppConfig.class})
public class WebSocketsPocApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebSocketsPocApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WebSocketsPocApplication.class, args);
	}

}
