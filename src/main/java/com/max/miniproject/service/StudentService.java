package com.max.miniproject.service;

import com.max.miniproject.domin.Student;
import com.max.miniproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAllStu() {
        return studentRepository.findAll();
    }

    public void saveAllStudents(List<? extends Student> list) {
        studentRepository.saveAll(list);
    }
}
