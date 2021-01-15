package com.RestExample.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name0) {
        this.id = id;
        this.name = name0;
        System.out.println("Adding user "+ name0 + ", id "+id);
    }

    public UUID getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
