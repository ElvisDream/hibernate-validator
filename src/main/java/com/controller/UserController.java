package com.controller;

import com.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by Elivs on 2017/4/25.
 */
@Controller
public class UserController {

    @RequestMapping(path="/login",method = RequestMethod.POST)
    public ModelAndView login(@Valid UserBean user, BindingResult br) {
        ModelAndView modelAndView = new ModelAndView();
        if (br.hasErrors()) {
            modelAndView.setViewName("login");
            return modelAndView;
        }
        modelAndView.setViewName("main");
        modelAndView.addObject("userName", user.getUsername());
        System.out.println(user.getUsername());
        return modelAndView;
    }
}
