package com.mohyehia.spring.docker.controller;

import com.mohyehia.spring.docker.entity.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String viewHello() {
        return "Hello from spring boot app";
    }

    @GetMapping("/messages")
    public ResponseEntity<List<String>> viewMessages() {
        List<String> messages = Arrays.asList(
                "Hello world", "Another message", "Last message"
        );
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> viewPersons() {
        List<Person> persons = Arrays.asList(
                Person.builder().firstName("mohammed").lastName("yehia").age(27).job("Java developer").build(),
                Person.builder().firstName("ahmed").lastName("yehia").age(24).job("Software engineer").build(),
                Person.builder().firstName("amr").lastName("samir").age(30).job("Quality control").build(),
                Person.builder().firstName("safwat").lastName("assem").age(27).job("Java developer").build()
        );
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }

    @GetMapping("/maven")
    public String viewRunWithMaven(){
        return "Hello from docker with maven plugin with newly created Github Webhook!";
    }
}
