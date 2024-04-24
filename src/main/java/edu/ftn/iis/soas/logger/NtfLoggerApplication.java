package edu.ftn.iis.soas.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("edu.ftn.iis.soas.domain.repository")
@EntityScan("edu.ftn.iis.soas.domain.model")
public class NtfLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NtfLoggerApplication.class, args);
	}

}
