package com.example.client2;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class Client2ApplicationTest {

    @Test
    public void contextLoads() throws Exception {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8081/client/play?flag=1",String.class);
        String result = entity.getBody();
        System.out.println(result);
    }

}