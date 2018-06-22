package com.dream.service.impl;

import com.dream.dao.utils.Response;
import com.dream.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl extends BaseService implements IndexService {



    @Override
    public Response login(String loginName, String password) {
        return null;
    }

    @Override
    public Response register(String name, String phone, String qq, String password) {
        return null;
    }
}
