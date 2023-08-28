package com.example.first.service;

import com.example.first.domain.Member;
import com.example.first.dto.*;
import com.example.first.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional // 중간에 예외가 발생하면 롤백시키기 위해
    public MemberSignUpResponseDTO signUpMember(MemberSignUpRequestDTO memberSignUpRequestDTO){
        Member member = memberSignUpRequestDTO.memberDtoToEntity(memberSignUpRequestDTO);
        memberRepository.save(member); //memberRepository가 memeber엔티티를 영속성 컨텍스트에 저장
        return MemberSignUpResponseDTO.builder()
                .email(member.getEmail())
                .build();
    }


}
