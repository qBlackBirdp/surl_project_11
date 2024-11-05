package com.hys.exam.surl_project_11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Surl {
    private long id;
    private LocalDateTime createTime = LocalDateTime.now();
    private LocalDateTime modifyTime = LocalDateTime.now();
    private String body;
    private String url;

}
