package com.penn.springmvctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/1/2.
 */
@Controller
public class IndexController {
    @Autowired
    private App app;
    @RequestMapping("/home")
    public String index() {
        return "index";
    }

    @RequestMapping("/greeting")
    public ModelAndView greeting(ModelAndView modelView) {
        modelView.addObject("greeting", app.sayHello());
        modelView.setViewName("greeting");
        return modelView;
    }
}
