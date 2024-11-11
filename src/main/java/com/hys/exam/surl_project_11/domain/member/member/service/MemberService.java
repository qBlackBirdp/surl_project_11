package com.hys.exam.surl_project_11.domain.member.member.service;

import com.hys.exam.surl_project_11.domain.member.member.entity.Member;
import com.hys.exam.surl_project_11.domain.member.member.repository.MemberRepository;
import com.hys.exam.surl_project_11.global.exceptions.GlobalException;
import com.hys.exam.surl_project_11.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public RsData<Member> join(String username, String password, String nickname) {
//        boolean present = findByUsername(username).isPresent();
//        if (present) {
//            return RsData.of("400-1", "이미 존재하는 아이디입니다.", Member.builder().build());
//        }

        findByUsername(username).ifPresent(ignored -> {
            throw new GlobalException("400-1", "이미 존재하는 아이디야");
        });

        Member member = Member.builder()
                .username(username)
                .password(password)
                .nickname(nickname)
                .build();
        memberRepository.save(member);
        return RsData.of("회원가입이 완료되었습니다.", member);
    }

    @Transactional
    public Optional<Member> findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }

    public Member getReferenceById(long id) {
        return memberRepository.getReferenceById(id);
    }

    public long count() {
        return memberRepository.count();
    }
}
