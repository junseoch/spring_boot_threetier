package com.app.threetier.api;

import com.app.threetier.domain.dto.ApiResponseDTO;
import com.app.threetier.domain.dto.PostDTO;
import com.app.threetier.domain.vo.MemberVO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts/*")
@RequiredArgsConstructor
public class PostAPI {

    private final PostService postService;

    // 게시글 등록
    @PostMapping("create")
    public ResponseEntity<ApiResponseDTO> create(@RequestBody PostVO postVO) {
        postService.create(postVO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("게시글 등록완료"));
    }

    // 게시글 목록
    @GetMapping("list")
    public List<PostDTO> list() {
       return postService.list();
    }

    // 게시글 상세조회
    @GetMapping("read/{id}")
    public Optional<PostDTO> read(@PathVariable Long id) {
        return postService.read(id);
    }

    @PutMapping("modify")
    public void modify(@RequestBody PostVO postVO) {
        postService.modify(postVO);
    }

    @DeleteMapping("delete")
    public void delete(@PathVariable Long id) {
        postService.delete(id);
    }

}
