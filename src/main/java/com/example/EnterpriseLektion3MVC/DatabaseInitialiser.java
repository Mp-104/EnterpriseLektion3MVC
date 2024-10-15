package com.example.EnterpriseLektion3MVC;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitialiser {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init () {

        MyUser user1 = new MyUser();
        user1.setName("Max");
        user1.setPassword("{noop}test");
        user1.setNumberOfClicks(0);


        userRepository.save(user1);

        MyUser user2 = new MyUser();
        user2.setName("Karl");
        user2.setPassword("{noop}test");
        user2.setNumberOfClicks(0);

        userRepository.save(user2);
    }

}
