package com.dream.service.impl;

import com.dream.dao.domain.User;
import com.dream.dao.utils.Response;
import com.dream.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Override
    public Response<List<User>> list() {

        List<User> users = userMapper.selectAll();
        return Response.success(users);
    }

    @Override
    public Response<User> getById(int id) {
        User user = new User();
        user.setId(id);
        user = userMapper.selectOne(user);
        return Response.success(user);
    }

    @Override
    public void insert(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
