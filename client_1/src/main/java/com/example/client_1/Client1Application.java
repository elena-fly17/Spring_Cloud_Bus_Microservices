package com.example.client_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// Когда эта аннотация применяется к классу в Spring-приложении, это указывает на то,
// что приложение должно быть зарегистрировано как клиент Eureka-сервера, чтобы оно
// могло обнаруживать и использовать др. сервисы, зарегистрированные в той же сети
@EnableEurekaClient
public class Client1Application {

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
	}

}
