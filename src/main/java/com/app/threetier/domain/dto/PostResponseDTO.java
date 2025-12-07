package com.app.threetier.domain.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class PostResponseDTO {

    private Long id;
    private String postTitle;
    private String postContent;
    private Long postReadCount;
    private Long memberId;
    private String memberName;
    private String memberEmail;

    public PostResponseDTO(PostDTO postDTO) {
        this.id = postDTO.getId();
        this.postTitle = postDTO.getPostTitle();
        this.postContent = postDTO.getPostContent();
        this.postReadCount = postDTO.getPostReadCount();
        this.memberId = postDTO.getMemberId();
        this.memberName = postDTO.getMemberName();
        this.memberEmail = postDTO.getMemberEmail();
    }

}
