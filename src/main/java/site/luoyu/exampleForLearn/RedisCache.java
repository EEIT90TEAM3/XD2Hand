package site.luoyu.exampleForLearn;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Computer user xd
 * Created by 张洋 on 2017/3/7.
 */
@Component
public class RedisCache {
    @Cacheable(value = "cacheTest", key = "2")
    public String testCache(String id) {
        return "result";
    }
}
