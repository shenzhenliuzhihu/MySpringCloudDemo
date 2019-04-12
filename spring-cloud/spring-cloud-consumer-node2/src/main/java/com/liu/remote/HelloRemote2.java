package com.liu.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘志虎
 * @date 2019/4/11 23:20
 */
@FeignClient(name = "spring-cloud-producer1",fallback = HelloRemote2Hystrix.class)
public interface HelloRemote2 {

    @RequestMapping("/{name}")
     String hello(@PathVariable("name") String name);
}
