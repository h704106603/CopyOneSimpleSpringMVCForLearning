package cn.jxufe.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jxufe.manager.BeanTest;

public class MainTest{

    public static void main(String[] args){
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanTest human = (BeanTest)appCtx.getBean("beanTest");
        human.say();
    }

}
