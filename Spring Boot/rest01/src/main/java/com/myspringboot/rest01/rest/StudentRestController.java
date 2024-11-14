package com.myspringboot.rest01.rest;


import com.myspringboot.rest01.entity.Student;
import com.myspringboot.rest01.entity.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student > students;

    @PostConstruct
    public void loadStudentData(){
        students= new ArrayList<>();
        students.add(new Student("Neha","MN"));
        students.add(new Student("Safi","M"));
        students.add(new Student("Suhail","MN"));
        students.add(new Student("Zoya","MN"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentByID(@PathVariable int studentId) {
        if(studentId < 0 || studentId >= students.size()){
            throw new StudentNotFoundException("Student Not Found: " + studentId);
        }
        return students.get(studentId);
    }

}
