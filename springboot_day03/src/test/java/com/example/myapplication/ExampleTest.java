package com.example.myapplication;

import com.example.myapplication.user.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class)
public class ExampleTest {

    @Autowired
    UserService userService;

    @Test
    public void di() {
        Assert.assertNotNull(userService);
    }
}
