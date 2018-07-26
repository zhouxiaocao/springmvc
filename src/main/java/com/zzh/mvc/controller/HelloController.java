package com.zzh.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zhouzhihu
 * @date: 2018/7/26
 */
@Controller
public class HelloController
{
    @RequestMapping("/")
    public String hello(Model model, @RequestParam(name="name",defaultValue = "World") String userName)
    {
        model.addAttribute("message","Hello, "+userName);
        return "resultPage";
    }
}
