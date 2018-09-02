package com.example.template.eventbus;

import com.example.template.TemplateApplication;
import com.example.template.common.utils.EventBusUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TemplateApplication.class)
public class EventAuditorTest {

    @Test
    public void auditString() {
        EventBusUtils.post("this is string");
    }

    @Test
    public void handleUnsubscribedEvent() {
        EventBusUtils.post(1);
    }
}