package com.david.design.obsever.improve;

/**
 * @description: 观察者接口，由具体的观察者来实现
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
public interface Observer {

    /**
     * 更新天气情况，是由 WeatherData 来调用，我们使用推送模式
     */
    void update(Double temperature, Double pressure, Double humidity);
}
