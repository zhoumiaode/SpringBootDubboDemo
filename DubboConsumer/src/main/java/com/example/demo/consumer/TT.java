package com.example.demo.consumer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TT
 * @Description TODO
 * @Author zmd
 * @Date 2019/8/12 10:46
 * Version 1.0
 **/
public class TT {

    public static void main(String[] args){
        Map<String ,Object> map =new HashMap<>();
        map.put("a",null);
        map.put("b","123");
        for(int i=0;i<5;i++){
            System.out.print("12"+"\n");
            if(null==map.get("b"))continue;
            else System.out.print("124222243"+"\n");
        }
    }
}
