package com.app.threetier.repository;

import com.app.threetier.domain.vo.MemberVO;
import com.app.threetier.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// jpa
@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

    // 이메일 중복 확인
    public boolean existMemberEmail(String memberEmail){
        return memberMapper.existMemberEmail(memberEmail);
    }

    // 데이터를 DB에 저장(save)
    // 회원 가입
    public void save(MemberVO memberVO) {
        memberMapper.insert(memberVO);
    }

    // 이메일로 아이디 조회
    public Long findIdByMemberEmail(String memberEmail){
        return memberMapper.selectIdByMemberEmail(memberEmail);
    }

    // 아이디로 회원 조회
    public Optional<MemberVO> findMemberById(Long id) {
        return memberMapper.select(id);
    };


    // 회원 정보 수정
    public void updateByMember(MemberVO memberVO) {
        memberMapper.update(memberVO);
    }

    // 회원 탈퇴
    public void deleteById(Long id){
        memberMapper.delete(id);
    }



}
