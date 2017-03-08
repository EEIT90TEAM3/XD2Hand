package site.luoyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import site.luoyu.exampleForLearn.RedisCache;
import site.luoyu.exampleForLearn.RedisExample.Receiver;


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
