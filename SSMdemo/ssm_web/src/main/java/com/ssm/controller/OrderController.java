package com.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.domain.Orders;
import com.ssm.service.IOrderService;
import com.ssm.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/6 15:37
 */
@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;

    //没分页
//    @RequestMapping("findAll.do")
//    public ModelAndView findAll(){
//        ModelAndView mv=new ModelAndView();
//        List<Orders> ordersList=iOrderService.findAll();
//        mv.addObject("ordersList",ordersList);
//        mv.setViewName("orders-list");
//        return mv;
//
//
//
//    }
    @RequestMapping("findAll.do")
    public ModelAndView findAll(@RequestParam(name="page",required = true,defaultValue = "1")int page,@RequestParam(name="size",required = true,defaultValue = "4")int size){
        ModelAndView mv=new ModelAndView();
        List<Orders> ordersList=iOrderService.findAll(page,size);
        //pageinfo就是分页的bean
        PageInfo pageInfo=new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-list");
        return mv;



    }
    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id",required = true)String orderId){
        ModelAndView mv=new ModelAndView();
        Orders orders=iOrderService.findById(orderId);
        mv.addObject("orders",orders);
        mv.setViewName("orders-show");
        return mv;

    }

}
