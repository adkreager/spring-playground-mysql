package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LessonsController {

    private final LessonRepository repository;

    public LessonsController(LessonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public Iterable<Lesson> getAll() {
        return this.repository.findAll();
    }

    @PostMapping("/save")
    public Lesson create(@RequestBody Lesson lesson) {
        return this.repository.save(lesson);
    }



}
