package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdatePwdRequestDTO {
    private String email;
    private String originPwd;
    private String newPwd;

    @Builder
    public MemberUpdatePwdRequestDTO(String email, String originPwd, String newPwd){
        this.email = email;
        this.originPwd = originPwd;
        this.newPwd = newPwd;
    }
}
