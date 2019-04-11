package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 刘志虎
 * @date  2019/4/11
 */
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducerApplication.class, args);
    }

}
