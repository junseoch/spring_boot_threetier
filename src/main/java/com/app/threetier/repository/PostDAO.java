package com.app.threetier.repository;

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

    public void save(PostVO postVO){
        postMapper.insert(postVO);
    }

    public List<PostVO> selectAll(){
        return postMapper.selectAll();
    }

    // 게시글 상세조회
    public Optional<PostVO> select(Long id){
        return postMapper.select(id);
    }

}
