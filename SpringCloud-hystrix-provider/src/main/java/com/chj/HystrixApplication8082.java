package com.chj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 17:34
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chj.mapper")
@EnableCircuitBreaker
public class HystrixApplication8082 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication8082.class,args);
    }
}
