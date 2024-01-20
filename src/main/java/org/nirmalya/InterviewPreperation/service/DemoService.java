package org.nirmalya.InterviewPreperation.service;

import org.nirmalya.InterviewPreperation.dto.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DemoService {

    public List<Person> getPersonById(int id);
}
