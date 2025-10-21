package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// @Transactional
// 트랜잭션 작업 중 오류가 발생했을 때 특정 커밋을 방지하고, 롤백시키는 어노테이션이다.

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO;

    @Override
    public void register(MemberVO memberVO) {
        memberDAO.save(memberVO);
    }
}
