package com.example.first.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor
public class Member {


    @Id
    @Column(name ="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(name = "email")
    private String email;

    @Column(name = "pwd")
    private String pwd;

    @Builder
    public Member(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }
}
