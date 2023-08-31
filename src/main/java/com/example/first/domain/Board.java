package com.example.first.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // 엔티티 지정
@Table(name = "board") // 엔티티와 매핑할 테이블 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 파라미터가 없는 기본 생성자 생성. 외부에서 무분별하게 해당 엔티티 객체 생성을 방지하기 위해 PROTECTED
// application.properties에 spring.jpa.hibernate.ddl-auto=update 을 해주면
// 엔티티 클래스에서 정의한 테이블이 데이터베이스에 존재하지 않을 때 해당 테이블을 자동생성해줌.
public class Board {

    @Id // 엔티티의 PK값 지정
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 식별자(PK) 자동 생성. 오토 인크리먼트
    private Long boardId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Builder
    public Board(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Member boardSetMember(Member member) {
        this.member = member;
    }
}
