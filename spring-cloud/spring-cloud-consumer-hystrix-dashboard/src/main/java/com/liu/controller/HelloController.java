package com.liu.controller;

import com.liu.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘志虎
 * @date 2019/4/11 23:18
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/{name}")
    public String index(@PathVariable("name") String name){
        return helloRemote.hello(name);
    }
}
