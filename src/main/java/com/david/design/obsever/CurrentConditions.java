package com.david.design.obsever;

import lombok.Data;

/**
 * @description:
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
@Data
public class CurrentConditions {

    /**
     * 温度
     */
    private Double temperature;


    /**
     * 气压
     */
    private Double pressure;


    /**
     * 湿度
     */
    private Double humidity;


    /**
     * 更新天气情况，是由WeatherData来调用，我们使用推送模式
     */
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

        System.out.println("****** Today Temperature : " + temperature + " ******");
        System.out.println("****** Today Pressure : " + pressure + " ******");
        System.out.println("****** Today Humidity : " + humidity + " ******");
    }
}
