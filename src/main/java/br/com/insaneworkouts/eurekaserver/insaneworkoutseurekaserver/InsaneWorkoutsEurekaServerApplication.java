package br.com.insaneworkouts.eurekaserver.insaneworkoutseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InsaneWorkoutsEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsaneWorkoutsEurekaServerApplication.class, args);
    }

}
