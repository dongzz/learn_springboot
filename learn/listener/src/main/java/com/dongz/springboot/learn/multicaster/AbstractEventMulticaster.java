package com.dongz.springboot.learn.multicaster;

import com.dongz.springboot.learn.event.WeatherEvent;
import com.dongz.springboot.learn.listener.WeatherListener;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dong
 * @date 2020/5/9 13:36
 * @desc
 */
public abstract class AbstractEventMulticaster implements EventMulticaster {

    @Resource
    private List<WeatherListener> listenerList ;

    @Override
    public void multicastEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(i -> i.onWeatherEvent(event));
        doEnd();
    }

    @Override
    public void addLister(WeatherListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeLister(WeatherListener listener) {
        listenerList.remove(listener);
    }

    abstract void doStart();
    abstract void doEnd();
}
