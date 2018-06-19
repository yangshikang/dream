package com.dream.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    protected HttpServletRequest request;


}
