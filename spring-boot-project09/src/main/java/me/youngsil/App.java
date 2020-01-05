package me.youngsil;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);
    }

    @Bean
    public WebClientCustomizer webClientCustomizer() {
        return webClientBuilder -> webClientBuilder.baseUrl("http://localhost:8080")
    }
}
