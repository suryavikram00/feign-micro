package com.feign.feign_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.api.open.crud.api.feignclient") // Specify the package containing your Feign clients
// @ComponentScan(basePackages = "com.api.open.crud.api")
public class FeignMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignMicroApplication.class, args);
	}

}
