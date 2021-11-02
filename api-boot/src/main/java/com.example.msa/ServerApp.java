package com.example.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.msa"})
public class ServerApp {
    public static void main (String[] args) {
        ApplicationContext app = SpringApplication.run(ServerApp.class, args);
    }
}
