package com.example.template.common.utils;

import com.google.common.eventbus.EventBus;

public class EventBusUtils {

    private static EventBus eventBus;

    public static void init(){
        if(eventBus == null){
            eventBus = new EventBus();
        }
    }

    public static void register(Object object){
        eventBus.register(object);
    }

    public static void post(Object event){
        eventBus.post(event);
    }

}
