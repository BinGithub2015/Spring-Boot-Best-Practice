package com.example.client2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCircuitBreaker
@RestController
public class Client2Application {

    @Autowired
    private Player player;

    public static void main(String[] args) {
        SpringApplication.run(Client2Application.class, args);
    }

    @RequestMapping(value = "/client/play",method = RequestMethod.GET)
    public String play(@RequestParam int flag){
        String result = player.play(flag);
        System.out.println(result);
        return result;
    }

}
