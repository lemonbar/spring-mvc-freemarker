/* 
 * Copyright (c) 2014 General Electric Company. All rights reserved. 
 * 
 * The copyright to the computer software herein is the property of 
 * General Electric Company. The software may be used and/or copied only 
 * with the written permission of General Electric Company or in accordance 
 * with the terms and conditions stipulated in the agreement/contract 
 * under which the software has been supplied. 
 */
package com.lemon.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greeting/{user}", method = RequestMethod.GET)
    public String greeting(@PathVariable String user, Model model) {
        List<String> userList = Arrays.asList(user.split("-"));
        //userList is the variable name, used in ftl file.
        model.addAttribute("userList", userList);
        return "welcome";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public ModelAndView greeting(@RequestParam("user") String user) {
        List<String> userList = Arrays.asList(user.split("-"));
        ModelAndView result = new ModelAndView("welcome");
        //userList is the variable name, used in ftl file.
        result.addObject("userList", userList);
        return result;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
