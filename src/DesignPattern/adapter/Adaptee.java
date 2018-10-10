package DesignPattern.adapter;

/**
 * description: 被适配者。也就是说需要适配的类，达成目标的类
 * Author: xuesong
 * Date: 2018-10-10 15:19
 **/
public class Adaptee {
    public void specialRequest(){
        System.out.println("Special Request!");
    }
}
