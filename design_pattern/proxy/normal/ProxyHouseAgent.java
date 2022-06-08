package com.example.test.proxy.normal;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/8
 */
public class ProxyHouseAgent implements HouseService {

    //具体主题要被代理起来
    private HouseServiceImpl houseServiceImpl;


    public ProxyHouseAgent (HouseServiceImpl houseService){
         this.houseServiceImpl = houseService;
    }

    @Override
    public void saleHouse() {
        System.out.println("带你看房-----------");
        System.out.println("你很满意");
        houseServiceImpl.saleHouse();
        System.out.println("佣金到手，哈哈哈");
    }
}
