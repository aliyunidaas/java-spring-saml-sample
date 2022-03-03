package com.aliyunidaas.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author gch
 * @Date 2022/1/20
 */
@Controller
public class AppController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sensitive_resource")
    public String getSensitiveResource() {
        return "success";
    }
}