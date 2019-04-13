package com.liu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘志虎
 * @date 2019/4/11 23:12
 */
@RestController
public class HelloController {

    @RequestMapping("/{name}")
    public String index(@PathVariable("name") String name){
        return "hello "+name+"，this is first producer";
    }
}
