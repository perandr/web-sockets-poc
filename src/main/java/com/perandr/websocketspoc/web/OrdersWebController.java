package com.perandr.websocketspoc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdersWebController {

    @GetMapping({"/index"})
    public String index(){
        return "index";
    }
}
