package me.youngsil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    YoungsilProperties youngsilProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(youngsilProperties.getName());
        System.out.println(youngsilProperties.getAge());
        System.out.println(youngsilProperties.getSessionTimeout());
    }
}
