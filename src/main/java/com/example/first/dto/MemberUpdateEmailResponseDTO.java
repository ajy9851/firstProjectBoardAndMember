package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdateEmailResponseDTO {
    private String newEmail;

    @Builder
    public MemberUpdateEmailResponseDTO(String newEmail){
        this.newEmail = newEmail;
    }
}
