package com.example.template.controller.rabbitmq;

import com.example.template.controller.AbstractController;
import com.example.template.rabbitmq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rabbitmq")
public class RabbitmqController extends AbstractController {

    @Autowired
    Sender sender;

    @RequestMapping(value = "/sender/{msg}",method = RequestMethod.GET)
    public String sender(@PathVariable String msg){
        sender.sender(msg);
        return "ok";
    }

}
