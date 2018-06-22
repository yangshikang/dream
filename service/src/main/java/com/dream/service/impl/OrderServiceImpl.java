package com.dream.service.impl;

import com.dream.dao.domain.Order;
import com.dream.dao.utils.Response;
import com.dream.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
@Service
public class OrderServiceImpl extends BaseService implements OrderService {

    @Override
    public Response<List<Order>> list() {

        List<Order> orders = orderMapper.selectAll();
        return Response.success(orders);
    }

    @Override
    public Response<Order> getById(int id) {

        Order order = new Order();
        order.setId(id);
        order = orderMapper.selectOne(order);
        return Response.success(order);
    }

    @Override
    public Response<Order> getByUserId(int userId) {

        Order order = new Order();
        order.setUserId(userId);
        order = orderMapper.selectOne(order);
        return Response.success(order);
    }

    @Override
    public void insert(Order order) {
        orderMapper.insertSelective(order);
    }

    @Override
    public void update(Order order) {
        orderMapper.updateByPrimaryKeySelective(order);
    }
}
