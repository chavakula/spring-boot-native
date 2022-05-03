package com.chavakula.nativeapp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final StudentRepository repo;

    @GetMapping("/students")
    Collection<Student> get(){
        return this.repo.findAll();
    }

}
