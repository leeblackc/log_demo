package com.lhc.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(LogDemoApplication.class);
    public static void main(String[] args) {

        logger.trace("======trace");
        logger.debug("======debug");
        logger.info("======info");
        logger.warn("======warn");
        logger.error("======error");
        SpringApplication.run(LogDemoApplication.class, args);
    }

}
