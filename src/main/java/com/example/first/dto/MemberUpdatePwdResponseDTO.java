package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdatePwdResponseDTO {
    private String email;

    @Builder
    public MemberUpdatePwdResponseDTO(String email){
        this.email = email;
    }

}
