package com.example.test.proxy.normal;

/**
 * @Author: zhangpeng
 * @Description:  静态代理：买房子这个实际业务的实现主题subjext
 * @Date: 2022/6/8
 */
public class HouseServiceImpl implements HouseService{
    @Override
    public void saleHouse() {
        System.out.println("-----------买房子的具体业务start------------");
        System.out.println("审查资格");
        System.out.println("贷款");
        System.out.println("房票，验收，拿钥匙");
        System.out.println("-----------买房子的具体业务end------------");
    }
}
