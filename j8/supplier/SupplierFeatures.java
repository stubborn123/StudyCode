package com.example.test.j8.supplier;

import java.util.function.Supplier;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/11/12
 */
public class SupplierFeatures {

    public static void main(String[] args) {

        Supplier<String> str = () -> "ZP handsome.";
        System.out.println("lambda Supplier :" + str.get() );

        Person person = new Person();

        Supplier<String> str1 = person::makerMoney;
        System.out.println(" Non static method Supplier :" + str1.get());


        Supplier<Person> personSupplier1 = Person::new;
        System.out.println(" construction method Supplier : " + personSupplier1.get().getName());

        personSupplier1.get().setAge(18);
        personSupplier1.get().setName("Java之父抖音分父");
        System.out.println(" construction method Supplier : " + personSupplier1.get().getName());

        Person yupi = new Person(18,"18岁的架构师");
        Supplier<Person> personSupplier2 = () -> yupi;
        System.out.println(" construction method Supplier : " + personSupplier2.get().getName());



        //真正使用场景，就是传参一个对象进去
        PersonSupplier<String> ps1 = new PersonSupplier<>(18,"卖课",()->"嘎嘎噶韭菜" );
        System.out.println(" construction method Supplier : " + ps1.getSupplier().get());


        PersonSupplier<WebSite> ps2 = new PersonSupplier<>(18,"卖课",()->new WebSite("XX课程","高并发") );
        System.out.println(" construction method Supplier : " + ps2.getSupplier().get().getWebSiteName() + ps2.getSupplier().get().getTarget() );

    }
}
