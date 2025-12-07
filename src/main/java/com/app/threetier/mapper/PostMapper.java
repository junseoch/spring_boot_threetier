package com.app.threetier.mapper;

import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    // 게시글 추가
    public Long insert(PostVO postVO);

    // 게시글 단일 조회
    public Optional<PostResponseDTO> select(Long id);

    // 게시글 전체 조회
    public List<PostResponseDTO> selectAll();

    // 내가 쓴 게시글 전체조회
    public List<PostResponseDTO> selectAllByMemberId(Long memberId);

    // 게시글 수정
    public void update(PostVO postVO);

    // 조회수 증가
    public void updatePostReadCount(Long id);

    // 게시글 삭제
    public void delete(Long id);










}
