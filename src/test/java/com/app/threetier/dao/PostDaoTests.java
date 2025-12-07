package com.app.threetier.dao;

import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.repository.PostDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostDaoTests {

    @Autowired
    private PostDAO postDAO;

//    @Test
//    public void PostDaoCreateTest(){
//        PostVO postVO = new PostVO();
//        postVO.setId(2L);
//        postVO.setPostTitle("안녕");
//        postVO.setPostContent("안녕하세요 내용");
//        postVO.setMemberId(1L);
//        postDAO.save(postVO);
//    }
//
//    @Test
//    public void PostDaoSelectTest(){
//        PostResponseDTO postDTO = new PostResponseDTO();
//        postDTO = postDAO.save().get();
//        log.info("{}",postDTO);
//    }
//
//    @Test
//    public void PostDaoSelectAllTest(){
//        PostResponseDTO postDTO = new PostResponseDTO();
//        postDAO.selectAll();
//    }
//
//    @Test
//    public void PostDaoUpdateTest(){
//        PostVO postVO = new PostVO();
//        postVO.setId(2L);
//        postVO.setPostTitle("테스트 제목 바꿈!!");
//        postVO.setPostContent("테스트 내용 바꿈!!");
//        postDAO.update(postVO);
//    }
//
//    @Test
//    public void PostDaoDeleteTest(){
//        PostVO postVO = new PostVO();
//        postDAO.delete(3L);
//    }

}
