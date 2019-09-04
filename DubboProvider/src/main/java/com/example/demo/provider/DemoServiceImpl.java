package com.example.demo.provider;

import com.dubbo.demo.api.DemoService;
import com.dubbo.demo.api.domain.Girl;
import com.dubbo.demo.api.domain.Girls;
import com.example.demo.provider.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.provider
 * @ClassName: DemoServiceImpl
 * @Description: Api接口的实现
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

    @Resource
    private DemoMapper demoMapper;

    @Override
    public String sayHello(String s) {
        return "provierss";
    }

    @Override
    public List<Girls> getList() {
        return demoMapper.getList();
    }
}
