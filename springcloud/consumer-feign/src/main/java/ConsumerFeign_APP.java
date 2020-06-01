import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ author ezra
 * @ date 2020/6/1 18:13
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.ezra"})

@ComponentScan("cn.ezra")
public class ConsumerFeign_APP {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign_APP.class,args);
    }
}
