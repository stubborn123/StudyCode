package com.example.test.j8.supplier;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/11/12
 */
public class Person {

    private Integer age;

    private String name;

    public Person(){}

    public Person(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String  makerMoney(){
        return "  make money for live.  ";
    }
}
