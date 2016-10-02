package kz.kaznitu.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("kz.kaznitu.test")
public class SpringBootMvcDemo1Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootMvcDemo1Application.class) ;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcDemo1Application.class, args);
	}
}
