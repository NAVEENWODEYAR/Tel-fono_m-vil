package com.gowri.tech.controller;
/*
 * @author NaveenWodeyar
 * @date 05-12-2024
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public ResponseEntity<?> test(){
        log.warn("test controller");
        return ResponseEntity.ok("CONNECTED");
    }
}
