package com.dream.web.controller;

import com.dream.service.IndexService;
import com.dream.service.TaskService;
import com.dream.service.UserService;
import com.dream.service.WithdrawService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    protected HttpServletRequest request;

    @Resource
    protected IndexService indexService;
    @Resource
    protected TaskService taskService;
    @Resource
    protected UserService userService;
    @Resource
    protected WithdrawService withdrawService;

}
