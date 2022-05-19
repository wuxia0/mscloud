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
public class CloudAlibbaProvider9002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibbaProvider9002.class, args);
    }
}

