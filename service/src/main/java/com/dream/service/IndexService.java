package com.dream.service;


import com.dream.dao.utils.Response;

public interface IndexService {

    /**
     * 登录
     *
     * @param loginName
     * @param password
     * @return
     */
    Response login(String loginName, String password);


    /**
     * 注册
     *
     * @param name
     * @param phone
     * @param qq
     * @param password
     * @return
     */
    Response register(String name, String phone, String qq, String password);

    /**
     * 接单
     * @param orderId
     * @param userId
     * @return
     */
    Response orderTaking(Integer orderId, Integer userId);

}
