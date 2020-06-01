package cn.ezra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ author ezra
 * @ date 2020/5/13 11:19
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class Provider5001Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider5001Application.class,args);
    }
}
