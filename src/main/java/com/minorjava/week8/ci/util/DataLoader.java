package com.minorjava.week8.ci.util;

import com.minorjava.week8.ci.model.Hello;
import com.minorjava.week8.ci.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private HelloRepository helloRepository;

    @Autowired
    public DataLoader(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public void run(ApplicationArguments args) {
        helloRepository.save(new Hello(1L, "Hello World!"));
    }
}