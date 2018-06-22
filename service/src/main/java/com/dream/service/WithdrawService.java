package com.dream.service;

import com.dream.dao.domain.User;
import com.dream.dao.domain.Withdraw;
import com.dream.dao.utils.Response;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
public interface WithdrawService {

    /**
     * 查询所有用户
     *
     * @return
     */
    Response<List<Withdraw>> list();

    /**
     * 根据用户id查询
     *
     * @param id
     * @return
     */
    Response<Withdraw> getById(int id);


    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    Response<List<Withdraw>> getByUserId(int userId);

    /**
     * 增加用户
     *
     * @param withdraw
     */
    void insert(Withdraw withdraw);

    /**
     * 更新用户
     *
     * @param withdraw
     */
    void update(Withdraw withdraw);
}
