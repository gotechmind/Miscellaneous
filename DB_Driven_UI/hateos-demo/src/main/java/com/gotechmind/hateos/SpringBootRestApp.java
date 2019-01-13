package com.gotechmind.hateos;

//import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gotechmind.hateos.domain.FormField;
import com.gotechmind.hateos.domain.FormFieldRepository;
import com.gotechmind.hateos.domain.MultiValuedField;
import com.gotechmind.hateos.domain.MultiValuedFieldRepository;

@SpringBootApplication(scanBasePackages="com.gotechmind.hateos")
public class SpringBootRestApp {
	private static final Logger log = LoggerFactory.getLogger(SpringBootRestApp.class);
	
	public static void main(String args[]) {
		SpringApplication.run(SpringBootRestApp.class, args);
	}
	
	@Bean
	public CommandLineRunner formFieldInitializer(FormFieldRepository forFieldRepository,
			MultiValuedFieldRepository multiValuedFieldRepository) {
		return (args) -> {
			// save a couple of customers
			forFieldRepository.save(new FormField(1L, "text", "text", "NAME", false));
			forFieldRepository.save(new FormField(2L, "text", "text", "AGE", false));
			forFieldRepository.save(new FormField(3L, "combo", "combo", "COUNTRY", true));
			
			multiValuedFieldRepository.save(new MultiValuedField(1L,"India", 3L));
			multiValuedFieldRepository.save(new MultiValuedField(2L,"Japan", 3L));
			multiValuedFieldRepository.save(new MultiValuedField(3L,"Korea", 3L));
		};
	}
}
