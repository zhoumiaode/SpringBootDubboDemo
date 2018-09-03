package com.dubbo.demo.api.domain;

import java.io.Serializable;

/**
 * @ProjectName: SpringBootDubboDemo
 * @Package: com.example.demo.provider.domain
 * @ClassName: Girl
 * @Description: java类作用描述
 * @Author: zhoumiaode
 * @CreateDate: 2018/09/03 9:46
 * @UpdateUser: Neil.Zhou
 * @UpdateDate: 2018/09/03 9:46
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Girl implements Serializable{

    private int id;
    private String name;
    private int age;
    private String cupSize;

    public Girl(int id, String name, int age, String cupSize) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cupSize = cupSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}
