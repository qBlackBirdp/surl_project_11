package com.hys.exam.surl_project_11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SurlController {

    private List<Surl> surls;
    private long surlsLastId;

    @GetMapping("/add")
    @ResponseBody
    public Surl add(String body, String url) {
        Surl surl = Surl.builder()
                .id(++surlsLastId)
                .body(body)
                .url(url)
                .build();
        return surl;
    }
}
