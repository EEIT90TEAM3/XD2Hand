package site.luoyu.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.luoyu.exampleForLearn.RedisCache;
import site.luoyu.exampleForLearn.RedisExample.Receiver;
import site.luoyu.model.User;
import javax.validation.Valid;


/**
 * Created by xd on 2016/9/16.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private RedisCache cache;

    @Autowired
    private Receiver receiver;

    @RequestMapping()
    public String homeRedirect() {
        cache.testCache("1");
        receiver.redisPut();
        System.out.println(receiver.redisGet());
        return "redirect:/userAction/MainPage";
    }
}
