package cn.susuper.controller;

import cn.susuper.pojo.Customer;
import cn.susuper.service.CustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

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

    /**
     * 跳转到添加客户功能界面
     * @return
     */
    @RequestMapping("/toSavePage")
    public String toSavePage(){
        return "page/save";
    }

    /**
     * 跳转到客户列表界面
     * @param model
     * @return
     */
    @RequestMapping("toListPage")
    public String toListPage(Model model){
//   ??      重定向
        return "redirect:findByPage";
    }

    /**
     * 客户信息保存
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping("/save")
    public String create(Customer customer,Model model){
        customer.setId((long)123);
        try{
            customerService.create(customer);
            model.addAttribute("message","客户信息保存成功");
        }catch (Exception e){
            e.printStackTrace();

        }
        return "page/info";
    }

    /**
     * 用户信息删除，根据id
     * @param model
     * @return
     */
    @RequestMapping("/delete")
    public String delete(Model model, HttpServletRequest request){
        Long id =Long.parseLong(request.getParameter("id"));
        customerService.delete(id);
        model.addAttribute("message","删除客户信息成功");
        return "page/info";
    }

    /**
     * 根据id查询客户信息
     * @param request
     * @return
     */
    @RequestMapping("/findById")
    public Customer findById(HttpServletRequest request){
        Long id = Long.parseLong(request.getParameter("id"));
        Customer customer_info = null;
        customer_info = customerService.findById(id);
        return customer_info;
    }

    /**
     * 更新客户信息的方法
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping("/update")
    public String update(Customer customer,Model model){
        try {
            customerService.update(customer);
            model.addAttribute("message","更新客户信息成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return "page/info";
    }


}
