package com.ws.lsy.service.UserRegist;

import com.ws.lsy.domain.user.MemberRepository;
import com.ws.lsy.web.Dto.User.Regist.UserInfoSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class MemberRegistRequestService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long Regist(UserInfoSaveRequestDto userInfoSaveRequestDto) {
        return memberRepository.save(userInfoSaveRequestDto.toEntity()).getUserIdx();
    }

    /* 회원가입 시, 유효성 체크 */
    /*
    @Transactional
    public static Map<String, String> validateHandling(Errors errors) {
        Map<String, String> validatorResult = new HashMap<>();
        for (FieldError error : errors.getFieldErrors()) {
            String validKeyName = String.format("valid_%s", error.getField());
            validatorResult.put(validKeyName, error.getDefaultMessage());
        }
        return validatorResult;
    }
    */


}
