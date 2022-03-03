package com.aliyunidaas.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author gch
 * @Date 2022/1/20
 * @see "https://codetinkering.com/saml2-spring-security-5-2-tutorial/"
 * @see "https://github.com/code-tinkering/saml2-tutorial/tree/master/service-provider-example"
 */

@SpringBootApplication(scanBasePackages = "com.aliyunidaas.sample")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}