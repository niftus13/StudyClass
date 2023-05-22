package com.hi.board.domain.member;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MemberRegistRequest {
    private String uid;
    private String pw;
    private String uname;
    private MultipartFile uphoto;
    private String fileName;


}
