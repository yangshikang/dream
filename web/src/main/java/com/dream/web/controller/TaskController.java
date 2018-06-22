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
 * 任务大厅
 */
@Controller
@RequestMapping(value = "/task")
public class TaskController extends BaseController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {

        Response<List<Task>> tasks = orderService.list();
        request.setAttribute("tasks", tasks);
        return "/task";
    }

    @RequestMapping(value = "/getByUserId", method = RequestMethod.POST)
    @ResponseBody
    public Response getByUserId(HttpServletRequest request) {
        User user = (User) request.getAttribute("user_");

        Response<List<Task>> orderList = orderService.getByUserId(user.getId());
        return orderList;
    }


}
