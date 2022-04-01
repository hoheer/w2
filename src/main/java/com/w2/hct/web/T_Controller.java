package com.w2.hct.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class T_Controller {

    @GetMapping("/test") //
    public String tst() {
        return "test";
    }

}
