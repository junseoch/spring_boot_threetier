package com.app.threetier.domain.vo;

import lombok.*;

@NoArgsConstructor
@Getter @Setter
@ToString
@EqualsAndHashCode(of = "id")
public class MemberVO {

    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

}
