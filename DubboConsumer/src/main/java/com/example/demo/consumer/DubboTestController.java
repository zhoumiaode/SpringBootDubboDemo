package com.example.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.demo.api.Demo1Service;
import com.dubbo.demo.api.DemoService;
import com.dubbo.demo.api.domain.Girl;
import com.dubbo.demo.api.domain.Girls;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.consumer
 * @ClassName: DubboTestController
 * @Description: 消费者Controller
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/30 9:45
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/30 9:45
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@RestController
public class DubboTestController {
    @Reference(check=false)//启动消费者不检查服务者是否存在
    public DemoService demoService;
    @Reference
    public Demo1Service demo1Service;

    @RequestMapping(value = "hello/{name}",method = RequestMethod.GET)
    public String Hello(@PathVariable String name){
        String ret_msg;
        try {
            ret_msg  = demoService.sayHello(name);
        }catch (Exception e){
            e.printStackTrace();
            ret_msg = "出错啦！";
        }
        return  ret_msg;
    }

    @GetMapping(value = "/getList")
    public List<Girls> getList(){
        return demoService.getList();
    }

    @GetMapping(value = "test")
    public String test(){
        return demoService.sayHello("111");
    }

    @GetMapping(value = "test2")
    public String test2(){
        return demo1Service.sayHello("123");
    }

}
