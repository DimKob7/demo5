package com.ua.demo5.Service;

import com.ua.demo5.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

//@Component
@Service
public class StudentService {
    public List<Student> findAll() {
        return List.of(
                new Student("John", 20),
                new Student("Mary", 30),
                new Student("Bob", 40));
    }
    public Optional<Student> findById(int id) {
        return Optional.of(new Student("John", 20));
    }

    public void save(Student student) {
        System.out.println(student);
    }
}
