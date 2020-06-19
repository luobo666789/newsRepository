package com.bff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 案例
 */
@Controller()
public class HelloController {

    @RequestMapping(value = "/hello")
    public String  sayhello(){
        System.out.println("成功");
        return "success";
    }
}
