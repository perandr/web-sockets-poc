package com.perandr.websocketspoc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "HELLO");
        return "index";
    }
    
}
