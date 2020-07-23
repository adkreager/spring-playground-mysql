package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/lessons/{id}")
    public Optional<Lesson> getLessonById(@RequestParam Long id) {
        return this.repository.findById(id);
    }

    @DeleteMapping("/lessons/{id}")
    public void deleteById(@RequestParam Long id) {
        this.repository.deleteById(id);
    }
}
