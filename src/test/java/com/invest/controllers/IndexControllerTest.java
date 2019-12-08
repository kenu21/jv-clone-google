package com.invest.controllers;

import com.invest.Main;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
public class IndexControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void indexOk() throws Exception {
        mvc.perform(get("/index"))
                .andExpect(status().isOk())
                .andExpect(content().string("index"));
    }

    @Test
    public void submitOk() throws Exception {
        mvc.perform(post("/index/submit?q=http://www.guimp.com/&level=2"))
                .andExpect(status().isOk())
                .andExpect(content().string("page2"));
    }
}
