package com.app.threetier.service;

import com.app.threetier.domain.vo.MemberVO;
import com.app.threetier.domain.vo.PostVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PostService {

    // 게시글 작성
    public void register(PostVO postVO);

    // 게시글 목록(전체 조회)
    public List<PostVO> list(PostVO postVO);

    // 게시글 상세조회
    public Optional<PostVO> read(Long id);

}
