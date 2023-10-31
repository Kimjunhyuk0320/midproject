package com.joeun.midproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;




@Slf4j
@Controller
public class HomeController {


@GetMapping("/")
public String home() {
    log.info("test");
    return "index";
}

    
    
    
}
