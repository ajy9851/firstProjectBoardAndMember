package com.example.first.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // 엔티티 지정
@Table(name = "member") // 엔티티와 매핑할 테이블 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자 생성
public class Member {


    @Id // 엔티티 PK값 지정
    @Column(name ="member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 자동 생성, 오토 인크리먼트
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

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void updatePwd(String newPwd) {
        this.pwd = newPwd;
    }
}
