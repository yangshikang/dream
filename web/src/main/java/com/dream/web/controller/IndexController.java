package com.dream.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class IndexController extends BaseController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {

        return "index";
    }


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {

        return "login";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(HttpServletRequest request) {

        return "register";
    }


}
