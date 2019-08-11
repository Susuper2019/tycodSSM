package cn.susuper.controller;

import cn.susuper.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author susuper
 * @Date 2019/8/10 22:38
 * @description:
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    /**
     * 注入service层，使用@Resource和@Autowired都可以实现Bean的自动注入
     */
    @Autowired
    private CustomerService customerService;
}
