package com.example.template.controller.rabbitmq;

import com.example.template.common.constant.ResponseCode;
import com.example.template.common.model.response.Response;
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
    private Sender sender;

    @RequestMapping(value = "/sender/{msg}",method = RequestMethod.GET)
    public Response sender(@PathVariable String msg){
        sender.sender(msg);
        return response(ResponseCode.SUCCESS,null);
    }

}
