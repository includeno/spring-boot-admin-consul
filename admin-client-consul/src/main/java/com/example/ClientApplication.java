package com.example;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@Slf4j
public class ClientApplication {

    public static void main(String[] args) {
        log.info("args:"+ Arrays.toString(args));
        SpringApplication.run(ClientApplication.class,args);
    }
}
