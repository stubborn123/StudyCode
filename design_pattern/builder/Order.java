package com.example.test.builder;

import lombok.Data;

import java.time.LocalDate;

/**
 * @Author: zhangpeng
 * @Description:构建者模式
 * @Date: 2022/5/19
 */
@Data
public class Order {

    private String orderNo;

    private Long orderId;

    private LocalDate confirmDate;

    private String templateId;

    private Integer orderStatus;

    public static class Builder{

        private String orderNo;

        private Long orderId;

        private LocalDate confirmDate;

        private String templateId;

        private Integer orderStatus;

        public Builder(){

        }

        public Order build(){
            return new Order(this);
        }

        public Builder setOrderNo(String orderNo){
            this.orderNo = orderNo;
            return this;
        }

        public Builder setOrderId(Long orderId){
            this.orderId = orderId;
            return this;
        }

        public Builder setConfirmDate(LocalDate localDate){
            this.confirmDate = localDate;
            return this;
        }

        public Builder setTemplateId(String templateId){
            this.templateId = templateId;
            return this;
        }

        public Builder setOrderStatus(Integer orderStatus){
            this.orderStatus = orderStatus;
            return this;
        }
    }

    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.orderNo = builder.orderNo;
        this.confirmDate = builder.confirmDate;
        this.templateId = builder.templateId;
        this.orderStatus = builder.orderStatus;
    }
}
