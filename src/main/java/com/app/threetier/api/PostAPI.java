package com.app.threetier.api;

import com.app.threetier.domain.dto.ApiResponseDTO;
import com.app.threetier.domain.dto.PostResponseDTO;
import com.app.threetier.domain.vo.PostVO;
import com.app.threetier.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j @RequiredArgsConstructor
@RequestMapping("/posts/*")
public class PostAPI {

    private final PostService postService;

//    @PostMapping("write")
//    public ResponseEntity<ApiResponseDTO> writePost(@RequestBody PostVO postVO) {
//        Map<String, Long> response = postService.write(postVO);
//        // 다음 생성된 게시판 글의 ID
//        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("게시글 작성 완료", response));
//    }

    @PostMapping("write")
    public ResponseEntity<ApiResponseDTO> writePost(@RequestBody PostVO postVO) {
        Map<String , Long> response = postService.write(postVO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("게시글 작성 완료", response));
    }


    // 게시글 단일 조회
    @GetMapping("get-post/{id}")
    public ResponseEntity<ApiResponseDTO> getPost(@PathVariable Long id) {
        PostResponseDTO post = postService.getPost(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 조회 성공", post));
    }

    // 게시글 전체조회
    @GetMapping("get-posts")
    public ResponseEntity<ApiResponseDTO> getPosts() {
        List<PostResponseDTO> posts = postService.getPosts();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 목록 조회 성공", posts));
    }

    // 내가 쓴 게시글 목록
    @GetMapping("get-my-posts")
    public ResponseEntity<ApiResponseDTO> getMyPosts(@RequestBody Long id) {
        List<PostResponseDTO> posts = postService.getMyPosts(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 목록 조회 성공", posts));
    }

    @PutMapping("modify")
    public ResponseEntity<ApiResponseDTO> updatePost(@RequestBody PostVO postVO) {
        postService.modify(postVO);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 수정 조회 성공"));
    }

    @DeleteMapping("remove")
    public ResponseEntity<ApiResponseDTO> updatePost(@RequestBody Long id) {
        postService.remove(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 삭제 성공"));
    }

}

