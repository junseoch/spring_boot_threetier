package com.app.threetier.mapper;

import com.app.threetier.domain.vo.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Slf4j
public class PostMapperTests {

    @Autowired
    private PostMapper postMapper;

    @Test
    public void insertTest(){
        PostVO postVO = new PostVO();
        postVO.setId(2L);
        postVO.setPostTitle("게시글 제목 테스트1");
        postVO.setPostContent("게시글 내용 테스트1");
        postVO.setMemberId(3L);
    }

    @Test
    public void selectAllTest(){
        List<PostVO> posts = postMapper.selectAll();
    }

    @Test
    public void selectTest(){
        postMapper.select(1L);
    }

}
