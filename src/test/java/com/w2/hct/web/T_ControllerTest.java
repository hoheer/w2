package com.w2.hct.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.w2.hct.web.T_Controller;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = T_Controller.class)
public class T_ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void ret_t () throws Exception {
        String tst = "test";

        mvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(tst));

    }

}
