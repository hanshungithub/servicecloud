package cn.hassan.serviceprovider02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("cn.hassan.**.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider02Application.class, args);
    }
}
