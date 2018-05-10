package com.srmasset.api.operacao.srmasset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing
public class SrmassetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrmassetApplication.class, args);
	}
}
