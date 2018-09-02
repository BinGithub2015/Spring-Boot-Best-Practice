package eventbus;

import com.example.template.common.utils.EventBusUtils;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class EventAuditor {

    @PostConstruct
    private void init(){
        EventBusUtils.register(this);
    }

    @Subscribe
    @AllowConcurrentEvents
    public void auditString(String msg){
        log.info(msg);
    }

    @Subscribe
    public void handleUnsubscribedEvent(DeadEvent deadEvent){
        log.warn("No subscribers for "+deadEvent.getEvent());
    }

}
