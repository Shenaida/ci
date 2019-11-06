package com.minorjava.week8.ci.service;

import com.minorjava.week8.ci.model.Hello;
import com.minorjava.week8.ci.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloService {

    @Autowired
    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public List<Hello> findAll(){
        return (List<Hello>)helloRepository.findAll();
    }
}
