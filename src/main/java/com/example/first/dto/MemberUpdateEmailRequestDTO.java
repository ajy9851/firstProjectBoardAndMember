package com.example.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemberUpdateEmailRequestDTO {
    private String originEmail;
    private String newEmail;

    @Builder
    public MemberUpdateEmailRequestDTO(String originEmail, String newEmail) {
        this.originEmail = originEmail;
        this.newEmail = newEmail;
    }
}
