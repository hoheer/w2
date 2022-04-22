package com.ws.lsy.web.Dto.User.Regist;

import com.ws.lsy.domain.user.Member;
import com.ws.lsy.domain.user.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@NoArgsConstructor
public class UserInfoSaveRequestDto {

    @NotBlank(message = "아이디는 필수 입력 값입니다")
    private String name;

    private Role role;

    @NotBlank(message = "이메일은 필수입력 값입니다")
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "이메일 형식이 올바르지 않습니다.")
    private String email;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Pattern(regexp = "/^(?=.*[a-zA-Z])((?=.*\\d)(?=.*\\W)).{8,16}$/", message = "비밀번호는 8~16자 영문 소문자, 숫자, 특수기호가 모두 포함되야 합니다")
    private String password;

    @Builder
    public UserInfoSaveRequestDto(String name, Role role, String email, String password) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public Member toEntity() {
        return Member.builder()
                .name(name)
                .role(role)
                .email(email)
                .password(password)
                .build();
    }

}
