package com.david.design.obsever.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
public class WeatherData implements Subject {

    private Double temperature;
    private Double pressure;
    private Double humidity;
    /**
     * 观察者集合
     */
    private final List<Observer> observers;

    /**
     * 加入新的第三方
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void dataChange() {

        // 调用接入方的update方法
        notifyObservers();
    }

    public void setData(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        // 调用dataChange将最新的信息推送给接入方currentConditions
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {

        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {

            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
