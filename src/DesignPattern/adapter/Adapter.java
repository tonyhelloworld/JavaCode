package DesignPattern.adapter;


/**
 * description: 目标：转换成被适配者adaptee
 * 适配器模式： 将一个类的接口转换成客户希望的另一个接口。以达到原本不兼容的接口变成兼容的。既能复用
 * Author: xuesong
 * Date: 2018-10-10 14:56
 **/
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
