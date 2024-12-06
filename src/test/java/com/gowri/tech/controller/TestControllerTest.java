package com.gowri.tech.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class) // Enable Mockito extension for proper mocking
class TestControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private TestController testController;

    @BeforeEach
    void setUp() {
        // Initialize the MockMvc object before each test
        mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
    }

    @Test
    void testTestController() throws Exception {
        // Perform a GET request to the /v1 endpoint
        mockMvc.perform(get("/v1"))
                .andExpect(status().isOk()) // Expect a 200 OK status
                .andExpect(content().string("CONNECTED")); // Expect the response body to be "CONNECTED"
    }
}