package com.david.design.obsever.improve;

import lombok.Data;

/**
 * @description: 天气预报官网观察者
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
@Data
public class CurrentConditions implements Observer {

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

        System.out.println("====== 官方网站 ======");

        System.out.println("****** 官方网站 Today Temperature : " + temperature + " ******");
        System.out.println("****** 官方网站 Today Pressure : " + pressure + " ******");
        System.out.println("****** 官方网站 Today Humidity : " + humidity + " ******");
    }
}
