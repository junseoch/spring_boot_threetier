package com.app.threetier.api;

import com.app.threetier.domain.dto.ApiResponseDTO;
import com.app.threetier.domain.vo.MemberVO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/posts/*")
@RequiredArgsConstructor
public class PostAPI {

    private final PostService postService;

    @PostMapping("register")
    public void register(PostVO postVO) {
        postService.register(postVO);
    }

    @GetMapping("list")
    public List<PostVO> list(PostVO postVO) {
       return postService.list(postVO);
    }

    @PostMapping("read")
    public Optional<PostVO> read(Long id) {
        return postService.read(id);
    }

}
