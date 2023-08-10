package com.david.design.obsever.improve;

/**
 * @description: 由WeatherData来实现
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
public interface Subject {

    /**
     * 注册一个观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除某一个观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
