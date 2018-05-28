package com.example.demo.controller.error;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@WebMvcTest(ErrorController.class)
public class ErrorControllerTests {

    @Test
    public void contextLoads() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String rep = restTemplate.getForObject("http://localhost:8080/error/", String.class);
        System.out.println(rep);
    }

}
