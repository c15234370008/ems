package com.baizhi.controller;

import com.baizhi.entity.MyProduct;
import com.baizhi.entity.MyUser;
import com.baizhi.service.MyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/myproduct")
public class MyProductController {
    @Autowired
    private MyProductService myProductService;

    @ResponseBody
    @RequestMapping("/findAll")
    public String findAll(HttpServletRequest request){
        List<MyProduct> list = myProductService.findAll();
        request.setAttribute("list", list);
        return "productlist";
    }
    @RequestMapping("/remove")
    public String remove(Integer id){
        myProductService.remove(id);
        return "redirect:myproduct";
    }
    @RequestMapping("/add")
    public String add(MyProduct myproduct){
        myProductService.add(myproduct);
        return "redirect:myproduct";
    }
    @RequestMapping("/motify")
    public String motify(MyProduct myproduct){
        myProductService.motify(myproduct);
        return "redirect:/myproduct/findAll";
    }
    @RequestMapping("/findProduct")
    public String findProduct(String name,HttpServletRequest request){
        List<MyProduct> theseProduct = myProductService.findProduct(name);
        request.setAttribute("list", theseProduct);
        return "productlist";
    }
}