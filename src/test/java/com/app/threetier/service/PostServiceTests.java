package com.app.threetier.service;

import com.app.threetier.domain.dto.PostDTO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.repository.PostDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Autowired
    private PostDAO postDAO;

    @Test
    public void createTest()
    {
        PostVO postVO = new PostVO();
        postVO.setId(2L);
        postVO.setPostTitle("게시글 제목 테스트1");
        postVO.setPostContent("게시글 내용 테스트1");
        postVO.setMemberId(2L);
        postService.create(postVO);
    }

    // 전체조회
    @Test
    public void listTest(){
        PostDTO postDTO = new PostDTO();
        postService.list();
        log.info(postDTO.toString());
    }

    @Test
    public void modifyTest(){
        PostVO postVO = new PostVO();
        postVO.setId(2L);
        postVO.setPostTitle("테스트 제목 서비스!!");
        postVO.setPostContent("테스트 내용 서비스!!");
        postService.modify(postVO);
    }

    @Test
    public void deleteTest(){
        PostVO postVO = new PostVO();
        postService.delete(postVO.getId());
    }

}
