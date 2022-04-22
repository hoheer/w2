package com.ws.lsy.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private Long userIdx;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column(name = "email")
    private String email;

    @Column(name= "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Builder
    public Member(String name, Role role, String email, String password) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }
}
