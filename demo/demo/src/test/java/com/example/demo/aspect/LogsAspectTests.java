package com.example.demo.aspect;

import com.example.demo.controller.admin.AdminController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(AdminController.class)
public class LogsAspectTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void contextLoads() throws Exception {
        this.mvc.perform(get("/admin/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"state\":\"SUCCESS\",\"code\":1,\"body\":{\"name\":\"a\",\"age\":1}}"));
    }


}
