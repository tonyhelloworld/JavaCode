package DesignPattern.adapter;

/**
 * description: 适配器客户端
 * Author: xuesong
 * Date: 2018-10-10 15:32
 **/
public class AdapterClient {
    public static void main(String[] args){
        Target target;
        target = new Adapter();
        target.request();
    }
}
