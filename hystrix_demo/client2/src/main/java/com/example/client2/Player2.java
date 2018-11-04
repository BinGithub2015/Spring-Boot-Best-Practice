package com.example.client2;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Player2 {

    @HystrixCommand(fallbackMethod = "errorPlay")
    public String play(){
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8080/server/hello",String.class);
        String result = entity.getBody();
        System.out.println(Thread.currentThread());
        System.out.println(result);
        return result;
    }

    public String errorPlay(int flag,Throwable throwable){
        System.out.println(Thread.currentThread());
        return "errorPlay  " + flag +  "  " + throwable.getMessage();
    }

}
