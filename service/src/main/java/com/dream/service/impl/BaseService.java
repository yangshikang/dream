package com.dream.service.impl;

import com.dream.dao.mapper.OrderMapper;
import com.dream.dao.mapper.UserMapper;
import com.dream.dao.mapper.WithdrawMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * Created by yangshikang on 22/06/2018.
 */
public class BaseService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    protected UserMapper userMapper;
    @Resource
    protected OrderMapper orderMapper;
    @Resource
    protected WithdrawMapper withdrawMapper;
}
