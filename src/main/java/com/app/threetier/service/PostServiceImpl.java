package com.app.threetier.service;

import com.app.threetier.domain.dto.PostDTO;
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
    public void create(PostVO postVO) {
        postDAO.save(postVO);
    }

    @Override
    public List<PostDTO> list() {
        return postDAO.selectAll();
    }

    @Override
    public Optional<PostDTO> read(Long id) {
        return postDAO.select(id);
    }

    @Override
    public void modify(PostVO postVO) {
        postDAO.update(postVO);
    }

    @Override
    public void delete(Long id) {
        postDAO.delete(id);
    }
}
