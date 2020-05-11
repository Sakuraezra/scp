package cn.ezra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ author ezra
 * @ date 2020/5/11 17:09
 */
@EnableEurekaServer
@SpringBootApplication
public class eurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication.class, args);
    }
}
