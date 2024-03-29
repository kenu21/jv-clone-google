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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@AutoConfigureMockMvc
public class SearchControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void searchOk() throws Exception {
        mvc.perform(get("/search"))
                .andExpect(status().isOk())
                .andExpect(content().string("search"));
    }

    @Test
    public void findedOk() throws Exception {
        mvc.perform(get("/search/finded?q=test"))
                .andExpect(status().isOk())
                .andExpect(content().string("page4"));
    }
}
