package com.StarkIndustries.SpringSecurityMark2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String sayHello(){
        return "Greetings\nI am Optimus Prime";
    }
}
