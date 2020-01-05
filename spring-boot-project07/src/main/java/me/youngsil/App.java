package me.youngsil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}
