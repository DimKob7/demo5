package com.ua.demo5.rest;

import com.ua.demo5.Service.StudentService;
import com.ua.demo5.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
public List<Student> findAll() {
    return studentService.findAll();
}
@GetMapping("/students/{id}")
public Optional<Student> findById(@PathVariable int id) {
    return studentService.findById(id);
}
@PostMapping("/students")
public void save(@RequestBody Student student) {
    studentService.save(student);
}
}
