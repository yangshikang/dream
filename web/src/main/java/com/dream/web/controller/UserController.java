package com.dream.web.controller;

import com.dream.dao.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * 个人中心
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        User user = (User) request.getAttribute("user_");

        request.setAttribute("user", user);
        return "/user/index";
    }
}
