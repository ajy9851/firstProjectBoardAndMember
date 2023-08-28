package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemberSignUpResponseDTO {
    private String email;

    @Builder
    public MemberSignUpResponseDTO(String email) {
        this.email = email;
    }
}
