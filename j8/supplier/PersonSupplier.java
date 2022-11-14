package com.example.test.j8.supplier;

import java.util.function.Supplier;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/11/12
 */
public class PersonSupplier<T> {

    private Integer age;

    private String name;

    Supplier<T> supplier;


    public PersonSupplier(Integer age, String name, Supplier<T> supplier) {
        this.age = age;
        this.name = name;
        this.supplier = supplier;
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

    public Supplier<T> getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier<T> supplier) {
        this.supplier = supplier;
    }
}
