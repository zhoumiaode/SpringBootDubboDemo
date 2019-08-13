package com.example.demo.consumer;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/** head
 *
 */
public class Test {

    /** 
     *@Author zhoumiaode 
     *@Description TODO
     *@Date 2019/8/12 11:12
     *@Param [args]
     *@Return void
     *@Exception 
     **/
    public static void main(String[] args){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1","2");
        jsonObject.element("2","3");
        System.out.print(jsonObject.toString()+"\n");
        JSONArray jsonArray=new JSONArray();
        for (int i=0;i<10;i++){
            JSONObject jsonObject1=new JSONObject();
            jsonObject1.put(i+2,i+2);
            jsonArray.add(jsonObject1);
        }
        jsonObject.element("jsonArray",jsonArray);
        System.out.print(jsonObject.toString()+"\n");

        BigDecimal bigDecimal=new BigDecimal(100);
        System.out.print(bigDecimal.divide(new BigDecimal(20))+"\n");

        Calendar calendar= Calendar.getInstance();
        System.out.print(calendar.getTime().toString()+"\n");
        System.out.print(calendar.get(Calendar.YEAR)+"\n");
        Date date =calendar.getTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print(simpleDateFormat.format(date)+"\n");
        Calendar calendar1= Calendar.getInstance();
        calendar1.add(Calendar.DATE,-1);
        Date date1=calendar1.getTime();
        System.out.print(simpleDateFormat.format(date1)+"\n");

        List<String> list = new ArrayList<>();
        if(list==null){
            System.out.print(1);
        }else if(list.size()==0){
            System.out.print(2);
            System.out.print(111);
            System.out.print(11111);
            System.out.print(2222222);
        }

    }
}
