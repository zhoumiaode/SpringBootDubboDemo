package com.example.demo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.dubbo.demo.api.DemoService;
import com.dubbo.demo.api.domain.Girl;
import com.dubbo.demo.api.domain.Girls;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@EnableCaching
@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.example.demo.provider.mapper")
@RestController
public class ProviderApplication {

  /*  //DataSource配置
   @Bean
   @ConfigurationProperties(prefix="spring.datasource")
   public DataSource dataSource() {
       return new org.apache.tomcat.jdbc.pool.DataSource();
   }
*/
    @Resource
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

    @GetMapping("test")
    public List<Girls> getGirls(){
        return demoService.getList();
    }

    @GetMapping("test1")
    public List<Girls> getGirl(){
        List<Girls> girls=new ArrayList<>();
        for(int i =0;i<5;i++){
            Girls girls1=new Girls();
            girls1.setId(i);
            girls1.setAge(i);
            girls1.setName(""+i);
            girls.add(girls1);
        }
        return  girls;
    }
}
