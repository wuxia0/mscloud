package springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: wuxia
 * @Date: 2022/05/18 22:36
 */
@SuppressWarnings("all")
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("springcloud.mapper")
public class SeataOrderMain2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderMain2001.class, args);
    }
}

