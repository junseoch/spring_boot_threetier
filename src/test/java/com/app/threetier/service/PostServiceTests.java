package com.app.threetier.service;

import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.repository.PostDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Autowired
    private PostDAO postDAO;

    @Test
    public void registerTest()
    {
        PostVO postVO = new PostVO();
        postVO.setId(2L);
        postVO.setPostTitle("게시글 제목 테스트1");
        postVO.setPostContent("게시글 내용 테스트1");
        postVO.setMemberId(3L);
    }


}
