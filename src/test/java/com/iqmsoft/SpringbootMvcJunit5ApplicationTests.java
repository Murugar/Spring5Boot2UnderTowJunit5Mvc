package com.iqmsoft;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.iqmsoft.WelcomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(JUnitPlatform.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest({WelcomeController.class, HelloController.class})
public class SpringbootMvcJunit5ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {
        mockMvc.perform(get("/test")).andExpect(status().isOk());
    }
    
    @Test
    void contextLoadsAgain() throws Exception {
        mockMvc.perform(get("/welcome")).andExpect(status().isOk());
    }
    
    @Test
    void contextLoadsAndAgain() throws Exception {
        mockMvc.perform(get("/hello")).andExpect(status().isOk());
    }
    
}
