package com.example.template.eventbus;

import com.example.template.common.utilities.EventBusUtilties;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EventAuditor {

    private Logger logger = Logger.getLogger(EventAuditor.class);

    @PostConstruct
    private void init(){
        EventBusUtilties.register(this);
    }

    @Subscribe
    @AllowConcurrentEvents
    public void auditString(String msg){
        logger.info(msg);
    }

    @Subscribe
    public void handleUnsubscribedEvent(DeadEvent deadEvent){
        logger.warn("No subscribers for "+deadEvent.getEvent());
    }

}
