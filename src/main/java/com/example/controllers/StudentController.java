package com.example.controllers;

import com.example.entities.Student;
import com.example.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Operation(summary = "Récupérer tous les étudiants")
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
    @PostMapping("/save")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.save(student), HttpStatus.CREATED);
    }
    @GetMapping("/byYear")
    public ResponseEntity<Collection<?>> findByYear() {
        return ResponseEntity.ok(studentService.findNbrStudentByYear());
    }

    // GET http://localhost:8080/students/getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(studentService.findAll());
    }
    @GetMapping("/count")
    public ResponseEntity<Long> countStudent() {
        return ResponseEntity.ok(studentService.countStudents());
    }

    // GET http://localhost:8080/students/get/1
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    // PUT http://localhost:8080/students/update/1
    @PutMapping("/update/{id}")
    public ResponseEntity<Student> update(@PathVariable("id") Long id, @RequestBody Student student) {
        student.setId(id);
        return ResponseEntity.ok(studentService.save(student));
    }

    // DELETE http://localhost:8080/students/delete/1
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        studentService.delete(id);
        return ResponseEntity.noContent().build();
    }

}