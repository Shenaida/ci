package com.minorjava.week8.ci.mapper;

import com.minorjava.week8.ci.dto.HelloDto;
import com.minorjava.week8.ci.model.Hello;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class Mapper {
    public HelloDto toHelloDto(Hello hello){
        var helloDto = new HelloDto();
        helloDto.setGreeting(hello.getGreeting());
        return  helloDto;
    }

    public List<HelloDto> toHelloDto(List<Hello> greetings){
        var helloDtos=new ArrayList<HelloDto>();

        for (var greeting:greetings) {

            helloDtos.add(toHelloDto(greeting));
        }
        return helloDtos;
    }
}
