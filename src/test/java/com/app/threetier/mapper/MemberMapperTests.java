package com.app.threetier.mapper;

import com.app.threetier.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void registerTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("spring333@gmail.com");
        memberVO.setMemberName("김철수");
        memberVO.setMemberPassword("1234");
        memberMapper.insert(memberVO);
    }

    @Test
    public void existMemberEmailTest(){
        log.info("이메일 중복확인 : {}", memberMapper.existMemberEmail("test123@gmail.com"));
    }

    @Test
    public void selectTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("spring333@gmail.com");
        memberVO.setMemberName("김철수");
        memberVO.setMemberPassword("1234");
//        Optional<MemberVO> foundMember =  memberMapper.select(memberVO);
//        foundMember.map(MemberVO::getMemberEmail).ifPresent(log::info);
    }
}
