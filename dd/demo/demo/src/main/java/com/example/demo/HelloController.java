package com.example.demo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/test")
    public String test(){

        MongoClient mongoClient = new MongoClient("");
         MongoDatabase database = mongoClient.getDatabase("");
        return "test";
    }

}