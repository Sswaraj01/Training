package io.pivotal.workshop.codesnippetmanagerjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="io.pivotal.*")
@SpringBootApplication
public class CodeSnippetManagerJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeSnippetManagerJdbcApplication.class, args);
	}

}

