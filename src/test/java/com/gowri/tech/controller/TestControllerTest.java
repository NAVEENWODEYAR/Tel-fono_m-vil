package com.gowri.tech.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class TestControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private TestController testController;

    @Mock
    private Logger logger;

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

        // Verify that the log.warn was called exactly once during the execution of the controller method
        verify(logger, times(1)).warn("test controller");
    }
}
