package com.app.threetier.domain.vo;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class PostVO {

    private Long id;
    private String postTitle;
    private String postContent;
    private Long postReadCount;
    private Long memberId;

}
