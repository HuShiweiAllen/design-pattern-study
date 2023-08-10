package com.david.design.obsever.improve;

/**
 * @description:
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
public class Client {

    public static void main(String[] args) {

        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        MojiSite mojiSite = new MojiSite();

        // 注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);
        weatherData.registerObserver(mojiSite);

        // 测试
        System.out.println("通知各个注册的观察者，查看天气信息......");
        weatherData.setData(10.5, 20.6, 30.8);

        // 移除观察着
        weatherData.removeObserver(currentConditions);

        // 测试
        System.out.println();
        System.out.println("通知各个注册的观察者，查看天气信息......");
        weatherData.setData(66.6, 88.8, 99.9);
    }
}
