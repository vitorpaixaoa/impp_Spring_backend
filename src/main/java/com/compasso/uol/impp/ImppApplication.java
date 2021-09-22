package com.compasso.uol.impp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
public class ImppApplication {

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("GMT-3"));
        System.out.println("Aplicação Spring rodando com TimeZone GMT-3 (São Paulo) :"+new Date());
    }
    public static void main(String[] args) {
        SpringApplication.run(ImppApplication.class, args);
    }

}
