package com.ecommerce.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.IOException;

@EntityScan({"com.ecommerce.common.entity","com.ecommerce.admin.user"})
@SpringBootApplication
@EnableJpaRepositories("com.ecommerce.*")
//@ComponentScan(basePackages = "com.ecommerce.*")

//@EntityScan({"com.ecommerce.common.*"})
public class EcommerceBackEndApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EcommerceBackEndApplication.class, args);
	}

}
