package com.example.template.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "")
    public void receive(String in) throws InterruptedException {
        //do some things
    }

}
