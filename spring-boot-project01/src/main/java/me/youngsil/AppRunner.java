package me.youngsil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.jws.Oneway;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Man man;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(man.getName());
    }
}
