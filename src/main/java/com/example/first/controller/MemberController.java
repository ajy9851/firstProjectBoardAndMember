package com.example.first.controller;

import com.example.first.dto.*;
import com.example.first.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity signUpMember(@RequestBody MemberSignUpRequestDTO memberSignUpRequestDTO){
        MemberSignUpResponseDTO memberSignUpResponseDTO = memberService.signUpMember(memberSignUpRequestDTO);
        return ResponseEntity.ok(memberSignUpResponseDTO);
        //ResponseEntity를 사용하면 상태코드를 직접 리턴할 수 있다. 공부하는 느낌으로 해보는 작은 프로젝트니 한 번 사용해보자.
    }

    @PostMapping("/update/email")
    public ResponseEntity updateEmail(@RequestBody MemberUpdateEmailRequestDTO memberUpdateEmailRequestDTO) {
        MemberUpdateEmailResponseDTO memberUpdateEmailResponseDTO = memberService.updateEmail(memberUpdateEmailRequestDTO);
        return ResponseEntity.ok(memberUpdateEmailResponseDTO);
    }

    @PostMapping("update/pwd")
    public ResponseEntity updatePwd(@RequestBody MemberUpdatePwdRequestDTO memberUpdatePwdRequestDTO) {
        MemberUpdatePwdResponseDTO memberUpdatePwdResponseDTO = memberService.updatePwd(memberUpdatePwdRequestDTO);
        return ResponseEntity.ok(memberUpdatePwdResponseDTO);
    }
}
