package com.app.threetier.mapper;

import com.app.threetier.domain.dto.PostDTO;
import com.app.threetier.domain.vo.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    // 게시글 작성
    public void insert(PostVO postVO);

    // 게시글 목록
    public List<PostDTO> selectAll();

    // 게시글 상세 조회
    public Optional<PostDTO> select(Long id);

    // 게시글 수정
    public void update(PostVO postVO);

    // 게시글 삭제
    public void delete(Long id);


}
