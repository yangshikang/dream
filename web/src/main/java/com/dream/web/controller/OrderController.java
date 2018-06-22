package com.dream.web.controller;

import com.dream.dao.domain.Order;
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
@RequestMapping(value = "order")
public class OrderController extends BaseController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {

        Response<List<Order>> orders = orderService.list();
        request.setAttribute("orders", orders);
        return "/order/index";
    }

    @RequestMapping(value = "/getByUserId", method = RequestMethod.POST)
    @ResponseBody
    public Response getByUserId(HttpServletRequest request) {
        User user = (User) request.getAttribute("user_");

        Response<List<Order>> orderList = orderService.getByUserId(user.getId());
        return orderList;
    }


}
