package io.pivotal.workshop.codesnippetmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="io.pivotal.*")
@SpringBootApplication
public class CodeSnippetManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeSnippetManagerApplication.class, args);
	}

}

