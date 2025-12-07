package com.app.threetier.mapper;

import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class PostMapperTests {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void insertTest(){
        PostVO postVO = new PostVO();
        postVO.setId(3L);
        postVO.setPostTitle("제목입니다!");
        postVO.setPostContent("내용입니다!");
        postVO.setMemberId(3L);
        postMapper.insert(postVO);
    }

    @Test
    public void selectAllTest(){
        PostResponseDTO postDTO = new PostResponseDTO();
        List<PostResponseDTO> posts = postMapper.selectAll();
        log.info("{}",posts);
    }

    @Test
    public void selectTest(){
        log.info("{}", postMapper.select(1L));
    }

    @Test
    public void updateTest(){
        PostVO postVO = new PostVO();
        postVO.setId(1L);
        postVO.setPostTitle("테스트 제목 수정수정");
        postVO.setPostContent("테스트 내용 수정수정");
        postMapper.update(postVO);
    }

    @Test
    public void deleteTest(){
        postMapper.delete(1L);
    }

}
