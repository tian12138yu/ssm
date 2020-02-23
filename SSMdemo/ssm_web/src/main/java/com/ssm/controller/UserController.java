package com.ssm.controller;

import com.ssm.domain.UserInfo;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/7 16:57
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        ModelAndView mv=new ModelAndView();
        List<UserInfo> userlist = iUserService.findAll();
        mv.addObject("userList",userlist);
        mv.setViewName("user-list");
        return mv;
    }
    @RequestMapping("/save.do")
    public String save(UserInfo userInfo){
        System.out.println(userInfo);
        iUserService.save(userInfo);
        return  "redirect:findAll.do";

    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        ModelAndView mv=new ModelAndView();
        UserInfo userlist = iUserService.findById(id);
        mv.addObject("user",userlist);
        mv.setViewName("user-show");
        return mv;
    }
}
