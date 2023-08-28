package com.example.first.dto;

import com.example.first.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemberSignUpRequestDTO {
    private String email;
    private String pwd;
    private String name;

    @Builder
    public MemberSignUpRequestDTO(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public Member memberDtoToEntity(MemberSignUpRequestDTO memberSignUpRequestDTO) {
        String email = memberSignUpRequestDTO.getEmail();
        String pwd = memberSignUpRequestDTO.getPwd();
        return Member.builder()
                .email(email)
                .pwd(pwd)
                .build();
    }
}
