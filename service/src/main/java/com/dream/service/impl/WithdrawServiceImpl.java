package com.dream.service.impl;

import com.dream.dao.domain.Withdraw;
import com.dream.dao.utils.Response;
import com.dream.service.WithdrawService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangshikang on 22/06/2018.
 */
@Service
public class WithdrawServiceImpl extends BaseService implements WithdrawService {


    @Override
    public Response<List<Withdraw>> list() {
        List<Withdraw> withdraws = withdrawMapper.selectAll();
        return Response.success(withdraws);
    }

    @Override
    public Response<Withdraw> getById(int id) {
        Withdraw withdraw = new Withdraw();
        withdraw.setId(id);
        withdraw = withdrawMapper.selectOne(withdraw);
        return Response.success(withdraw);
    }

    @Override
    public Response<Withdraw> getByUserId(int userId) {
        Withdraw withdraw = new Withdraw();
        withdraw.setUserId(userId);
        withdraw = withdrawMapper.selectOne(withdraw);
        return Response.success(withdraw);
    }

    @Override
    public void insert(Withdraw withdraw) {

        withdrawMapper.insertSelective(withdraw);
    }

    @Override
    public void update(Withdraw withdraw) {
        withdrawMapper.updateByPrimaryKeySelective(withdraw);
    }
}
