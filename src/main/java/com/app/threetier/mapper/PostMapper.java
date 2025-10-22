package com.app.threetier.mapper;

import com.app.threetier.domain.vo.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    // 게시글 작성
    public void insert(PostVO postVO);

    // 게시글 목록
    public List<PostVO> selectAll();

    // 게시글 상세 조회
    public Optional<PostVO> select(Long id);


}
