package com.example.template.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${rabbitmq.exchange}")
    String exchange;
    @Value("${rabbitmq.rountingKey}")
    String routingKey;

    public void sender(Object object) {
        rabbitTemplate.convertAndSend(exchange,routingKey,object);
    }
}
