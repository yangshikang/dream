package com.dream.service;

import com.dream.dao.domain.Order;
import com.dream.dao.utils.Response;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
public interface OrderService {


    /**
     *  查询所有订单
     * @return
     */
    Response<List<Order>> list();

    /**
     * 根据订单id查询
     * @param id
     * @return
     */
    Response<Order> getById(int id);


    /**
     * 根据订单id查询
     * @param userId
     * @return
     */
    Response<Order> getByUserId(int userId);


    /**
     *  增加订单信息
     * @param order
     */
    void insert(Order order);

    /**
     *  更新订单信息
     * @param order
     */
    void update(Order order);
}
