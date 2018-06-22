package com.dream.service;

import com.dream.dao.domain.Task;
import com.dream.dao.utils.Response;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
public interface TaskService {


    /**
     *  查询所有订单
     * @return
     */
    Response<List<Task>> list();

    /**
     * 根据订单id查询
     * @param id
     * @return
     */
    Response<Task> getById(int id);


    /**
     * 根据订单id查询
     * @param userId
     * @return
     */
    Response<List<Task>> getByUserId(int userId);


    /**
     *  增加订单信息
     * @param task
     */
    void insert(Task task);

    /**
     *  更新订单信息
     * @param task
     */
    void update(Task task);
}
