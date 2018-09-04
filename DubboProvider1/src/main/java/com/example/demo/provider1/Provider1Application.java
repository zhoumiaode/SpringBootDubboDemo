package com.example.demo.provider1;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.example.demo.provider1.mapper")
public class Provider1Application {

	public static void main(String[] args) {
		SpringApplication.run(Provider1Application.class, args);
	}
}
