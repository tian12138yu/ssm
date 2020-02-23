package com.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.domain.Product;
import com.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author tjy
 * @Date 2020/2/5 15:08
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name="page",required = true,defaultValue = "1")int page, @RequestParam(name="size",required = true,defaultValue = "4")int size){
        ModelAndView mv=new ModelAndView();
        List<Product> ps=productService.findAll(page,size);
        PageInfo pageInfo=new PageInfo(ps);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("product-list");
        return  mv;
    }
    @RequestMapping("/save.do")
    public String save(Product product){
        productService.sava(product);
        return "redirect:findAll.do";
    }
}
