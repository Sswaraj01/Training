package io.pivotal.workshop.webgsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="io.pivotal.*")
@SpringBootApplication
public class WebGspApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebGspApplication.class, args);
	}

}

