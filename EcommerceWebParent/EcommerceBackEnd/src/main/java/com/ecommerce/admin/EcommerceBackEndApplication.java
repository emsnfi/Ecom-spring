package com.ecommerce.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.io.IOException;

@SpringBootApplication
@EntityScan({"com.ecommerce.common.entity","com.ecommerce.admin.user"})

@EnableJpaRepositories("com.ecommerce.*")

public class EcommerceBackEndApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackEndApplication.class, args);
	}

}
