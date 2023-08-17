package com.ecommerce.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.ecommerce.*")
//@ComponentScan(basePackages = "com.ecommerce.*")
@EntityScan("com.ecommerce.common.entity")
//@EntityScan({"com.ecommerce.common.*"})
public class EcommerceBackEndApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackEndApplication.class, args);
	}

}
