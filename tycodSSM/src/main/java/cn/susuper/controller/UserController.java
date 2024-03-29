package cn.susuper.controller;

import cn.susuper.pojo.User;
import cn.susuper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author susuper
 * @date 2019/8/8 20:47
 */
@Controller
@RequestMapping("/user")
public class UserController {
//    注入service
    @Autowired
    private UserService userService;

    /**
     * 用户登录函数
     * @param model
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String username =
        User user = userService.login(request.getParameter("username"));
        System.out.println(user);
        if (user!=null){
            if (user.getPassword().equals(request.getParameter("password"))){
                //登录成功
                return "/page/page";
            }else{
                model.addAttribute("message","登录失败");
                return "/page/loginInfo";
            }
        }else{
            model.addAttribute("message","用户名失败，查不到此用户");
            return "/page/loginInfo";
        }
//        return  user;
    }

    /**
     * 回到登录页
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
