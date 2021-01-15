package com.RestExample.demo.dao;

import com.RestExample.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDoa {

    public int addPerson(UUID id,Person person);

    default int addPerson(Person person){
        UUID id=UUID.randomUUID();
        return addPerson(id,person);
    }

    List<Person> getList();
}
