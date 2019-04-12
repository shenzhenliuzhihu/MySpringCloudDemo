package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class SpringCloudHystrixDashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixDashboardTurbineApplication.class, args);
    }

}
