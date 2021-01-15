package com.RestExample.demo.dao;

import com.RestExample.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("Fake")
public class FakeDao implements PersonDoa{
    private List<Person> Db= new ArrayList<>();

    @Override
    public int addPerson(UUID id, Person person) {
//        String Username= person.getName();
        System.out.println("new user added "+ person.getName());
        Db.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getList() {
        return Db;
    }


}
