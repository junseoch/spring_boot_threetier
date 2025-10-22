package com.app.threetier.service;

import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;

    @Override
    public void register(PostVO postVO) {
        postDAO.save(postVO);
    }

    @Override
    public List<PostVO> list(PostVO postVO) {
        return postDAO.selectAll();
    }

    @Override
    public Optional<PostVO> read(Long id) {
        return postDAO.select(id);
    }
}
