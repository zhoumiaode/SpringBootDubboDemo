package com.example.demo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.concurrent.CountDownLatch;

@EnableCaching
@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.example.demo.provider.mapper")
public class ProviderApplication {

  /*  //DataSource配置
   @Bean
   @ConfigurationProperties(prefix="spring.datasource")
   public DataSource dataSource() {
       return new org.apache.tomcat.jdbc.pool.DataSource();
   }
*/
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
