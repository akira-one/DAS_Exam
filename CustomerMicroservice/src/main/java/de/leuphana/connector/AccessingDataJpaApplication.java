package de.leuphana.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import de.leuphana.component.structure.Cart;
import de.leuphana.component.structure.Customer;

@SpringBootApplication()
@EntityScan("de.leuphana.component.*")
@EnableJpaRepositories("de.leuphana.component.*")
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(AccessingDataJpaApplication.class, args);
	}

}