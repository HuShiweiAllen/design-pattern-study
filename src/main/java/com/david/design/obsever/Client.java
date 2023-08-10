package com.david.design.obsever;

/**
 * @description:
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
public class Client {

    public static void main(String[] args) {

        // 创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();

        // 创建WeatherData 并将接入方 currentConditions 传到WeatherData 中
        WeatherData weatherData = new WeatherData(currentConditions);

        // 更新天气情况
        weatherData.setData(30.3, 150.5, 40.8);

        // 天气情况变化
        System.out.println("============ 天气情况变化 ============");

        weatherData.setData(88.3, 99.5, 66.8);
    }
}
