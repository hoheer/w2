package com.ws.lsy.web.dto;

import com.ws.lsy.web.Dto.T_ResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class T_ResponseDtoTest {
    @Test
    public void lom_t () {
        String name = "test";
        int amount = 1000;

        T_ResponseDto dto = new T_ResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
