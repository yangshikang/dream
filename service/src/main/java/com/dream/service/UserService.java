package com.dream.service;

import com.dream.dao.domain.User;
import com.dream.dao.utils.Response;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
public interface UserService {


    /**
     *  查询所有用户
     * @return
     */
    Response<List<User>> list();

    /**
     * 根据用户id查询
     * @param id
     * @return
     */
    Response<User> getById(int id);

    /**
     *  增加用户
     * @param user
     */
    void insert(User user);

    /**
     *  更新用户
     * @param user
     */
    void update(User user);
}
