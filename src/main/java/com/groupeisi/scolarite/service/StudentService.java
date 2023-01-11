package com.groupeisi.scolarite.service;

import com.groupeisi.scolarite.entity.Student;
import com.groupeisi.scolarite.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void initializeStudentTable(){
        studentRepository.saveAll(
            Stream.of(
                new Student("Ngagne Fall", "M2"),
                new Student("Fatou DIOUF", "M1")
            ).collect(Collectors.toList())
        );
    }

    public Student getStudent(int studentId){
        return studentRepository
                .findById(studentId)
                .orElse(null);
    }

    public List<Student> getAllStudents(){
        return studentRepository
                .findAll();
    }
}
