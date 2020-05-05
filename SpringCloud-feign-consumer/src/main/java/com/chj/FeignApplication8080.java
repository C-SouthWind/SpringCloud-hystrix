package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 16:49
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication8080.class,args);
    }
}
