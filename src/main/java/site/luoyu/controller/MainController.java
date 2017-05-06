package site.luoyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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
}
