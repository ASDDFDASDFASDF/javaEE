package com.hyh.proxy.anno;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//注入运行引擎
@ContextConfiguration("classpath:applicationContext-anno.xml")//注入配置信息
public class AspectTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void test() {
        userService.run();
    }
}
