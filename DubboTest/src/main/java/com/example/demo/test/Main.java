package com.example.demo.test;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.test
 * @ClassName: Main
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/08/31 9:07
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/08/31 9:07
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args){

        long sumtime = 0;
        int count = 10000;
        //循环调用，请求id连续，判断请求是否丢失
        for(int i= 0;i< count;i++) {
            try {
                long start = System.currentTimeMillis();
                //jsoup 调用消费者地址
                Document doc = Jsoup.connect("http://localhost:8883/hello/请求"+i).get();
                Elements elements = doc.select("body");  //获取body中的内容
                long end = System.currentTimeMillis();
                long time = end-start;  //记录调用时间
                sumtime += time;
                String result = "执行时间" + time + "\t\t"+elements.text();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //计算平均调用时间
        float avgTime = sumtime/count;
        System.out.println("平均执行时间：" + avgTime +"毫秒");
    }
}
