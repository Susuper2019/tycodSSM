package cn.susuper.controller;

import cn.susuper.pojo.Customer;
import cn.susuper.pojo.PageBean;
import cn.susuper.service.CustomerService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    @RequestMapping("/toListPage")
    public String toListPage(Model model){
//        return "findByPage";
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
//        toListPage(model);
    }

    /**
     * 根据id查询客户信息
     * @param
     * @return
     */
    @RequestMapping("/findById")
    @ResponseBody
    public Customer findById(@RequestBody Customer customer, HttpServletResponse response) throws JsonProcessingException {
        Customer customer_info = customerService.findById(customer.getId());
        if (customer_info != null) {
            response.setContentType("application/json;charset=utf-8");
//            ObjectMapper mapper = new ObjectMapper();
//            String json = mapper.writeValueAsString(customer_info);
//            System.out.println(json);
//
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.addObject("data",customer_info);
//            return modelAndView;
//            return json;
            return customer_info;
        } else {
            return null;
        }
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


    /**
     * 分页查询
     * @param customer
     * @param pageCode
     * @param pageSize
     * @param model
     * @return
     *
     */
    @RequestMapping("/findByPage")
//    value表示参数名字  required表示是否为必需，defaultValue表示默认值
    public String findByPage(Customer customer,
                             @RequestParam(value = "pageCode",required = false,defaultValue = "1") int pageCode,
                             @RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize,
                             Model model){
        //这两个可以使用，但是一旦没有获取到参数，会报出参数异常，所以这里用了springmvc的获取方式
//        int pageCode = Integer.parseInt(request.getParameter(""));
//        int pageSize = Integer.parseInt(request.getParameter(""));
        //回显数据
        System.out.println("1");
        PageBean pageBean = customerService.findByPage(customer,pageCode,pageSize);
        model.addAttribute("page",pageBean);
        return "page/list";
    }
}
