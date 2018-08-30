package com.example.demo.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.api.DemoService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.provider
 * @ClassName: DemoServiceImpl
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/30 9:37
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/30 9:37
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */

@com.alibaba.dubbo.config.annotation.Service(interfaceClass = DemoService.class)
@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public String sayHello(String s) {
        String test = "调用失败";
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "provide服务提供方0:你好，"+s+"! \t\t " + test;
    }
}
