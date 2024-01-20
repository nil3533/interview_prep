package org.nirmalya.InterviewPreperation.controller;

import org.nirmalya.InterviewPreperation.dto.Person;
import org.nirmalya.InterviewPreperation.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Period;
import java.util.List;

@RestController
@RequestMapping("/")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("hello/{id}")
    public List<Person> init(@PathVariable int id){

        return demoService.getPersonById(id);
    }
}
