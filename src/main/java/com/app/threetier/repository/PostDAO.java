package com.app.threetier.repository;

import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;

    // 게시글 추가
    public Long save(PostVO postVO) {
        postMapper.insert(postVO);
        // PostVO insert 시퀀스의 증가된 값이 setter로 postVO의 id에 삽입
        return postVO.getId();
    }

    // 게시글 단일 조회
    public Optional<PostResponseDTO> findPost(Long id) {
        return postMapper.select(id);
    }

    // 게시글 전체 조회
    public List<PostResponseDTO> findPosts(){
        return postMapper.selectAll();
    }

    // 내가 쓴 글 전체 조회
    public List<PostResponseDTO> findPostsByMemberId(Long memberId){
        return postMapper.selectAllByMemberId(memberId);
    }

    // 게시글 수정
    public void update(PostVO postVO) {
        postMapper.update(postVO);
    }

    // 게시글 조회 수 증가
    public void updateReadCount(Long id){
        postMapper.updatePostReadCount(id);
    }

    // 게시글 삭제
    public void delete(Long id){
        postMapper.delete(id);
    }



















}







