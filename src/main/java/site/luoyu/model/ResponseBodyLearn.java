package site.luoyu.model;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Computer user xd
 * Created by 张洋 on 2017/2/21.
 */

@ResponseBody
public class ResponseBodyLearn {
    String name = "haha";
    String passwd = "123";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
