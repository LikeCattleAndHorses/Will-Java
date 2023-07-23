package com.mambazzh;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author MambaZzh
 * @Date 11:19 2019-11-04
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("mambazzh.com.designer.dao")
public class MambaApplication{
    private static final Logger logger = LoggerFactory.getLogger(MambaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MambaApplication.class, args);
        logger.info("SpringBoot启动成功！");
    }
}