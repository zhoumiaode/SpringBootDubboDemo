package com.example.demo.consumer;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        System.out.print(simpleDateFormat.format(date));

    }
}
