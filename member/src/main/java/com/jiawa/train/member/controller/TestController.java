package com.jiawa.train.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lzj
 * @Description:
 * @Date: Created in 17:24 2024/1/4
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Word!";
    }
}
