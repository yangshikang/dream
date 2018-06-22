package com.dream.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 后台管理
 */
@Controller
@RequestMapping(value = "admin")
public class AdminController extends BaseController {


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {


        return "/admin/index";
    }



}
