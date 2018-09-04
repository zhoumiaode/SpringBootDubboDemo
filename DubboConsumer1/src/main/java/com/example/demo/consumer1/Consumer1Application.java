package com.example.demo.consumer1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Consumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumer1Application.class, args);
	}
}
