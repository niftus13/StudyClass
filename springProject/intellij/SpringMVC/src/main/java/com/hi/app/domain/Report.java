package com.hi.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Report {
    private String snum;
    private String sname;
    private MultipartFile report;


}
