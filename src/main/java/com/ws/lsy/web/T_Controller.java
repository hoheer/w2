package com.ws.lsy.web;


import com.ws.lsy.web.Dto.T_ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class T_Controller {

    @GetMapping("/test") //
    public String tst() {
        return "test";
    }

    @GetMapping("/test/dto")
    public T_ResponseDto T_dto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new T_ResponseDto(name, amount);
    }

}
