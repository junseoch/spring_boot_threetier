package com.app.threetier.service;

import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;

import java.util.List;
import java.util.Map;

public interface PostService {
    // 게시글 추가
    public Map<String, Long> write(PostVO postVO);

    // 게시글 단일 조회
    public PostResponseDTO getPost(Long id);

    // 게시글 목록
    public List<PostResponseDTO> getPosts();

    // 내가 쓴 게시글 목록
    public List<PostResponseDTO> getMyPosts(Long memberId);

    // 게시글 수정
    public void modify(PostVO postVO);

    // 게시글 삭제
    public void remove(Long id);
}
