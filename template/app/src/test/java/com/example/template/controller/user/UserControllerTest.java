package com.example.template.controller.user;

import com.alibaba.fastjson.JSON;
import com.example.template.common.model.orm.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;

    @Before
    public void setupMockMvc() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testGet() throws Exception {
        mockMvc.perform(get("/api/user/1")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void testPost() throws Exception {
        User user = new User();
        user.setName("b");
        String json = JSON.toJSONString(user);
        System.out.println(json);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/user/").contentType(MediaType.APPLICATION_JSON).content(json))
                .andDo(MockMvcResultHandlers.print())
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());

    }
}