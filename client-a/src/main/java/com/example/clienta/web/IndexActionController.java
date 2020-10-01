package com.example.clienta.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexActionController {
    @GetMapping(value = "")
    public String index() {
        System.out.println("进入ClientA首页");
        return "index";
    }

    @GetMapping(value = "securedPage")
    public String home() {
        System.out.println("进入ClientA securedPage");
        return "securedPage";
    }
}
