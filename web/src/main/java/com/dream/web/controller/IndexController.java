package com.dream.web.controller;


import com.dream.dao.domain.User;
import com.dream.dao.mapper.UserMapper;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping
public class IndexController extends BaseController {


    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {

        List<User> users = userMapper.selectAll();

        logger.info("{}", new Gson().toJson(users.get(0)));

        request.setAttribute("users", users);
        return "index";
    }


}
