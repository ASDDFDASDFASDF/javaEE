package hyh.com.springbootinit.controller;

import hyh.com.springbootinit.pojo.Preson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${person.address[0]}")
    private String address;

    @Autowired//springboot内置环境对象
    private Environment env;

    @Autowired
    private Preson preson;

    @GetMapping("/getPre")
    public void getPre(){
        System.out.println(name);
        System.out.println(address);

        System.out.println(env.getProperty("person.address[0]"));
        System.out.println(preson.toString());

        Arrays.stream(preson.getAddress()).forEach(a -> {
            System.out.println(a);
        });
    }

}
