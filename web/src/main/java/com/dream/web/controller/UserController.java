package com.dream.web.controller;

import com.dream.dao.domain.Task;
import com.dream.dao.domain.User;
import com.dream.dao.domain.Withdraw;
import com.dream.dao.utils.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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

    @RequestMapping(value = "/getWithdrawByUserId", method = RequestMethod.POST)
    @ResponseBody
    public Response getWithdrawByUserId(HttpServletRequest request) {
        User user = (User) request.getAttribute("user_");

        Response<List<Withdraw>> orderList = withdrawService.getByUserId(user.getId());
        return orderList;
    }

    @RequestMapping(value = "/getTaskByUserId", method = RequestMethod.POST)
    @ResponseBody
    public Response getTaskByUserId(HttpServletRequest request) {
        User user = (User) request.getAttribute("user_");

        Response<List<Task>> taskLists = taskService.getByUserId(user.getId());
        return taskLists;
    }


}
