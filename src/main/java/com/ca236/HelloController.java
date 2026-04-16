package com.ca236;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping  // "/"  root URL
//@RequestMapping(method = RequestMethod.GET)
    public String welcome() {
    return "Welocme to Springboot!";
    }
}
