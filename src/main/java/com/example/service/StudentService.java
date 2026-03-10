package com.example.service ;

import com.example.entities.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public boolean delete(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            studentRepository.delete(studentOptional.get());
            return true;
        } else {
            return false;
        }
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public long countStudents() {
        return studentRepository.count();
    }

    public Collection<?> findNbrStudentByYear() {
        return studentRepository.findNbrStudentByYear();
    }
    public Student findById(Long id ){
        return studentRepository.findById(id).get();
    }
}