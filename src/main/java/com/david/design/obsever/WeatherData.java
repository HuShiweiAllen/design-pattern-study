package com.david.design.obsever;

import lombok.Data;

/**
 * 核心类
 * 1. 包含最新的天气情况信息
 * 2. 含有CurrentConditions对象
 * 3. 当数据有更新时，就主动调用CurrentConditions对象的update方法（包含display方法），这样
 * 他们（接入方）就能看到最新的信息
 *
 * @description:
 * @author: DavidAlen
 * @date: 2023/6/15
 **/
@Data
public class WeatherData {

    private Double temperature;

    private Double pressure;

    private Double humidity;

    private CurrentConditions currentConditions;

    /**
     * 加入新的第三方
     */
    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public void dataChange() {
        //调用 接入方的 update
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    /**
     * 当数据有更新时，就调用 setData
     */
    public void setData(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        //调用 dataChange， 将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }

}
