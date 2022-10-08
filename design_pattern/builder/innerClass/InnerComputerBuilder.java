package com.example.test.builder.innerClass;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/10/8
 */
public class InnerComputerBuilder {

    private String cpu;//必须
    private String ram;//必须
    private int usbCount;//可选
    private String keyboard;//可选
    private String display;//可选


   public static class Builder{
       //必须
       private String cpu;
       private String ram;
       //可选
       private int usbCount;
       private String keyboard;
       private String display;

       public Builder( String cpu,String ram){
           this.cpu = cpu;
           this.ram = ram;
       }

       public Builder usbCount(int usbCount){
            this.usbCount = usbCount;
            return this;
       }

       public Builder keyBoard(String keyboard){
           this.keyboard = keyboard;
           return this;
       }
       public Builder display(String display){
           this.display = display;
           return this;
       }

       public InnerComputerBuilder build(){
           return new InnerComputerBuilder(this);
       }

   }

   private InnerComputerBuilder(Builder builder){
       cpu = builder.cpu;
       ram = builder.ram;
       usbCount = builder.usbCount;

   }


    public static void main(String[] args) {
        InnerComputerBuilder computerDirector = new InnerComputerBuilder.Builder("12400","16G").usbCount(3).keyBoard("84").display("24").build();
    }
}
