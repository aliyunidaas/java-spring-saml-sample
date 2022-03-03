package com.aliyunidaas.sample;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Author gch
 * @Date 2022/1/20
 */
@RestController
public class SampleController {

    @GetMapping("/principal")
    public Object getOidcUserPrincipal2() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getPrincipal();
    }

    @GetMapping("/sensitive_resource")
    public String getSensitiveResource() {
        return "success";
    }
}