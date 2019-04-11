package com.liu.remote;

import org.springframework.stereotype.Component;

/**
 * @author 刘志虎
 * @date 2019/4/11 23:31
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
