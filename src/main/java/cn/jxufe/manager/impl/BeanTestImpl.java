package cn.jxufe.manager.impl;

import org.springframework.stereotype.Service;

import cn.jxufe.manager.BeanTest;

@Service("beanTest")
public class BeanTestImpl implements BeanTest{

    @Override
    public void say(){
        System.out.println("你好");
    }

}
