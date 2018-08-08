package com.example.template.eventbus;

import com.example.template.TemplateApplication;
import com.example.template.common.utilities.EventBusUtilties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TemplateApplication.class)
public class EventAuditorTest {

    @Test
    public void auditString() {
        EventBusUtilties.post("this is string");
    }

    @Test
    public void handleUnsubscribedEvent() {
        EventBusUtilties.post(1);
    }
}