package com.example.template.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "${rabbitmq.listener.queue}")
    public void receive(String in) throws InterruptedException {
        System.out.println(in);
    }

}
