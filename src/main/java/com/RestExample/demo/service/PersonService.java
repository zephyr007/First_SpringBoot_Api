package com.RestExample.demo.service;

import com.RestExample.demo.dao.PersonDoa;
import com.RestExample.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDoa personDoa;

    @Autowired
    public PersonService(@Qualifier("Fake") PersonDoa personDoa) {
        this.personDoa = personDoa;
    }

    public int insertPerson(Person person){
        return personDoa.addPerson(person);
    }

    public List<Person> getList(){
        return personDoa.getList();
    }
}
