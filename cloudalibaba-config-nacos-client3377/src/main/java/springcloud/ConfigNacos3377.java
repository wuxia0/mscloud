package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: wuxia
 * @Date: 2022/05/06 17:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigNacos3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigNacos3377.class, args);
    }
}

