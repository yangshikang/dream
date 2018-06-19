package com.dream.web.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class HttpConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private RestTemplate restTemplate;

}
