package com.dongz.springboot.learn.event;

/**
 * @author dong
 * @date 2020/5/9 10:24
 * @desc
 */
public class RainEvent extends WeatherEvent {
    @Override
    public String getWeatherEvent() {
        return "rain";
    }
}
