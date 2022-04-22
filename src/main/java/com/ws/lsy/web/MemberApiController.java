package com.ws.lsy.web;

import com.ws.lsy.service.UserRegist.MemberRegistRequestService;
import com.ws.lsy.web.Dto.User.Regist.UserInfoSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class MemberApiController {

    @Autowired
    private MemberRegistRequestService memberRegistRequestService;

    @PostMapping("/api/member/regist")
    public Long save(@RequestBody UserInfoSaveRequestDto requestdto) {

        return memberRegistRequestService.Regist(requestdto);
    }

    @PostMapping("/api/member/regist/check")
    public String check(@Valid UserInfoSaveRequestDto requestdto, Errors errors) {

        if (errors.hasErrors()) {
            /*
            model.addAttribute("requestdto", requestdto);
            Map<String, String> validatorResult = MemberRegistRequestService.validateHandling(errors);
            for (String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
            }
            */

            return "/member/regist";
        }
        memberRegistRequestService.Regist(requestdto);
        return "redirect:/";
    }

}

