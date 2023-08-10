package com.david.design.obsever.improve;

/**
 * @description: 天气预报百度网站观察者
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
public class BaiduSite implements Observer {
    private Double temperature;
    private Double pressure;
    private Double humidity;

    @Override
    public void update(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        display();
    }

    /**
     * 显示
     */
    public void display() {

        System.out.println("====== 百度网站 ======");

        System.out.println("====== 百度网站 Today Temperature : " + temperature + " ======");
        System.out.println("====== 百度网站 Today Pressure : " + pressure + " ======");
        System.out.println("====== 百度网站 Today Humidity : " + humidity + " ======");
    }
}
