package com.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.domain.Role;
import com.ssm.service.IRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/8 15:14
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    private IRoleService roleService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv =new ModelAndView();
        List<Role> roleList =roleService.findAll();
        PageInfo pageInfo=new PageInfo(roleList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("role-list");
        return  mv;
    }
    @RequestMapping("/save.do")
    public String  save(Role role){
        roleService.save(role);
        return "redirect:findAll.do";
    }

}
