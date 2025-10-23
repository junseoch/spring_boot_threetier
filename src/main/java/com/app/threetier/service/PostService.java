package com.app.threetier.service;

import com.app.threetier.domain.dto.PostDTO;
import com.app.threetier.domain.vo.MemberVO;
import com.app.threetier.domain.vo.PostVO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface PostService {

    // 게시글 작성
    public void create(PostVO postVO);

    // 게시글 목록(전체 조회)
    public List<PostDTO> list();

    // 게시글 상세조회
    public Optional<PostDTO> read(Long id);

    // 게시글 수정
    public void modify(PostVO postVO);

    // 게시글 삭제
    public void delete(Long id);

}
