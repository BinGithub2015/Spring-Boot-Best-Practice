package com.example.template.common.utilities;

import com.google.common.eventbus.EventBus;

public class EventBusUtilties {

    private static EventBus eventBus = new EventBus();

    public static void register(Object object){
        eventBus.register(object);
    }

    public static void post(Object event){
        eventBus.post(event);
    }

}
