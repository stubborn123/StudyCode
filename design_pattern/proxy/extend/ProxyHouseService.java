package com.example.test.proxy.extend;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/6/8
 */
public class ProxyHouseService extends ExtendHouseService{
    private Boolean intention;

    public ProxyHouseService(Boolean intention){
         this.intention = intention;
    }

    @Override
    public void saleHouse() {
        System.out.println("----带你踩盘----");
        if(intention){
            super.saleHouse();
            System.out.println("--------中介费到手---------");
        }else{
            System.out.println("客户没意向，这单没做成，寻找新目标");
        }

    }
}
