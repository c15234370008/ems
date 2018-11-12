package com.baizhi.controller;

import com.baizhi.entity.MyUser;
import com.baizhi.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/myuser")
public class MyUserController {
    @Autowired
    private MyUserService myUserService;

    @RequestMapping("/regist")
    public String regist(MyUser myuser,HttpServletRequest request){
        request.setAttribute("login", myuser);
        myUserService.regist(myuser);
        return "login";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String login(MyUser myuser){
        boolean b=myUserService.login(myuser);
        if(b==true){
            return "redirect:/myproduct/queryAll";
        }else{
            return "login";
        }
    }
}
