package com.weimr.designpatterns.mediator.demo;

/**
 * 销售管理
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }
    //销售IBM电脑
    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑"+number+"台");
    }
    //反馈销售情况，0~100之间变化，0代表没人买，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        int saleStatus = (int)(Math.random()*100);
        System.out.println("IBM电脑销售情况为："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
