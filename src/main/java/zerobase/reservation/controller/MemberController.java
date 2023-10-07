package zerobase.reservation.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zerobase.reservation.dto.MemberDto;
import zerobase.reservation.service.MemberService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
@Slf4j
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member")
    public ResponseEntity<?> signUp(@Valid @RequestBody MemberDto memberDto) {
        memberService.signUp(
                memberDto.getEmail(),
                memberDto.getNickname(),
                memberDto.getPassword(),
                memberDto.getPhoneNumber());
        return ResponseEntity.ok().build();
    }
}
