package org.nirmalya.InterviewPreperation.service.impl;

import org.nirmalya.InterviewPreperation.dto.Person;
import org.nirmalya.InterviewPreperation.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DemoServiceImpl implements DemoService {


    List<Person> initListOfPersons = Arrays.asList(
            new Person(1, "nirmalya", "Panihati"),
            new Person(1, "suny", "Panihati"),
            new Person(1, "roni", "Panihati")

    );

    public List<Person> getPersonById(int id) {
        return initListOfPersons.stream().filter(i -> i.getId()==id).collect(Collectors.toList());
    }

}
