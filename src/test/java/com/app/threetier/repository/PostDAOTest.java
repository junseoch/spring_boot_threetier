package com.app.threetier.repository;

import com.app.threetier.domain.vo.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class PostDAOTest {

    @Autowired
    private PostDAO postDAO;

    @Test
    void save() {
        PostVO postVO = new PostVO();
        postVO.setPostTitle("게시글 제목 테스트");
        postVO.setPostContent("게시글 내용 테스트");
    }

    @Test
    void findPost() {
    }

    @Test
    void findPosts() {
    }

    @Test
    void findPostsByMemberId() {
    }

    @Test
    void update() {
    }

    @Test
    void updateReadCount() {
    }

    @Test
    void delete() {
    }
}