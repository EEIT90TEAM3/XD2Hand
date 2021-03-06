package site.luoyu;

import com.fasterxml.jackson.databind.ObjectMapper;
import site.luoyu.model.User;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by xd on 2016/11/28.
 */
public class Jackson {

    public String testJackson(){

        String result = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            File tempFile = new File(".");
            URL path = Jackson.class.getResource("/");
            System.out.println(path.getPath());
            User user = mapper.readValue(new File(Jackson.class.getResource("/").getPath()+"/test.json"), User.class);
            System.out.println(user.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        new Jackson().testJackson();
    }
}
