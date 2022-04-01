package com.w2.hct.web.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class T_ResponseDto {
    private final String name;
    private final int amount;
}
