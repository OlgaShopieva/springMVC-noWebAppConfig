package ru.javacourses.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {


    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public ResponseEntity<Object> getUsers() {
        Map<String, String> users = new HashMap<>();
        users.put("name1", "surname1");
        users.put("name2", "surname2");
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

