package com.yuanpin.cloud.config.configserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Test {
//
//    @Value("${spring.cloud.config.server.git.password}")
//    public String password;

    @PostConstruct
    public void init(){
        log.info("hello");
    }

}
