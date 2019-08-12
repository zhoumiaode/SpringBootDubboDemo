package com.example.demo.consumer;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class Test {


    public static void main(String[] args){
        JSONPObject jsonpObject=new JSONPObject("JSON","JSON");
        System.out.print(jsonpObject.getValue());

    }
}
