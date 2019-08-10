package cn.susuper.controller;

import cn.susuper.pojo.User;
import cn.susuper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String login(Model model){
//        String username =
        User user = userService.login("username");
        if (user!=null){
            if (user.getPassword().equals("password")){
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
