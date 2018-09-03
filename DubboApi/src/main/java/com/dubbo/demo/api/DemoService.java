package com.dubbo.demo.api;

import com.dubbo.demo.api.domain.Girl;
import com.dubbo.demo.api.domain.Girls;

import java.util.List;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.dubbo.demo.api
 * @ClassName: DemoService
 * @Description: dubbo服务Api接口
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/30 9:25
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/30 9:25
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public interface DemoService {
    public String sayHello(String s);

    public List<Girls> getList();
}
