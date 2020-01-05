package me.youngsil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    @ConfigurationProperties("server")
    @Bean
    public ServerProperties serverProperties() {
        return new ServerProperties();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}
