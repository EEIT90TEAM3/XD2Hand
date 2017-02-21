package site.luoyu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.luoyu.model.User;
import javax.validation.Valid;


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
