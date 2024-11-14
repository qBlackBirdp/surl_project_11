package com.hys.exam.surl_project_11.domain.home.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Value("${custom.site.name}")
    private String customSiteName;


    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "Main on " + customSiteName + " 123123";
    }

}
