package com.minorjava.week8.ci.controller;

import com.minorjava.week8.ci.mapper.Mapper;
import com.minorjava.week8.ci.model.Hello;
import com.minorjava.week8.ci.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:1234")
public class HelloController {

    @Autowired
    private final Mapper mapper;
    private final HelloService helloService;

    public HelloController(Mapper mapper, HelloService helloService) {
        this.mapper = mapper;
        this.helloService = helloService;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
    @RequestMapping("/hello")
    @GetMapping()
    public ResponseEntity<Hello> read(){
        if(!helloService.findAll().isEmpty()){
            return new ResponseEntity(mapper.toHelloDto(helloService.findAll()), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
