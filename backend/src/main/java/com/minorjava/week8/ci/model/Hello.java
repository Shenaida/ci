package com.minorjava.week8.ci.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Hello {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID" )
    private Long id;

    @NotNull
    @Column(name="GREETING")
    private String greeting;

    public Hello(Long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public Hello() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
