package com.app.threetier.service;

import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.exception.PostException;
import com.app.threetier.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;

    @Override
    public Map<String, Long> write(PostVO postVO) {
        Map<String, Long> response = new HashMap<>();
        Long newPostId = postDAO.save(postVO);
        response.put("newPostId", newPostId);
        return response;
    }

    @Override
    public PostResponseDTO getPost(Long id) {
        postDAO.updateReadCount(id);
        return postDAO.findPost(id).orElseThrow(() -> new PostException("Post not found"));
    }

    @Override
    public List<PostResponseDTO> getPosts() {
        return postDAO.findPosts();
    }

    @Override
    public List<PostResponseDTO> getMyPosts(Long memberId) {
        return postDAO.findPostsByMemberId(memberId);
    }

    @Override
    public void modify(PostVO postVO) {
        postDAO.update(postVO);
    }

    @Override
    public void remove(Long id) {
        postDAO.delete(id);
    }
}
