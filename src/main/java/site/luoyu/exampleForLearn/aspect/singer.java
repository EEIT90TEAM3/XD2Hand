package site.luoyu.exampleForLearn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Computer user xd
 * Created by 张洋 on 2017/4/5.
 */
@Component
@Aspect
public class singer {

    @Pointcut("execution(* site.luoyu.exampleForLearn.aspect.knight.fight(..))")
    public void knightAction() {
    }

    @Before("knightAction()")
    public void sing() {
        System.out.println("The knight is going to fight");
    }
}
