package site.luoyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.luoyu.model.User;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;


/**
 * Created by xd on 2016/9/16.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping()
    public String homeRedirect() {
        return "redirect:/userAction/MainPage";
    }

    @RequestMapping("/testView")
    public String getTestView(Model model){
        model.addAttribute("User",new User());
        return "testForm";
    }

    @RequestMapping("testForm")
    @ResponseBody
    public String  testForm(@Valid User user, Errors errors){
        if(errors.hasErrors())return "testForm";
        return "用户名："+user.getName()+" 密码:"+user.getPasswd();
    }

    @RequestMapping("/testJson")
    @ResponseBody
    public String testJson(@RequestBody User user){
        System.out.println(user.getName()+" "+user.getPasswd());
//        todo Jquary当返回格式不是json就调用error
        return "success";
    }
}
