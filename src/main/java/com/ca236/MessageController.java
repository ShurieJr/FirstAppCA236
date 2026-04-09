package com.ca236;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
public class MessageController {
    @RequestMapping(method = RequestMethod.GET ,
            path = "/message")
//    @GetMapping("/message")
//    @ResponseBody
    public String welcome() {
        return "Welcome to CA236 CLASS!";
    }
}
