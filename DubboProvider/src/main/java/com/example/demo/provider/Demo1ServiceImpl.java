package com.example.demo.provider;

import com.dubbo.demo.api.Demo1Service;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.provider
 * @ClassName: Demo1ServiceImpl
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/30 14:52
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/30 14:52
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = Demo1Service.class)
public class Demo1ServiceImpl implements Demo1Service {
    @Override
    public String sayHello(String msg) {
        return "Hello Word";

    }
}
