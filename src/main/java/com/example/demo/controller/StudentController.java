package com.example.demo.controller;

import com.example.demo.model.Point;
import com.example.demo.model.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<Student>> showAllStudent(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Iterable<Point>> findStudentById(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getAllPointByIdStudent(id), HttpStatus.OK);
    }

    @GetMapping("/findByName/")
    public ResponseEntity<Student> findStudentByName(@RequestParam String name){
        return new ResponseEntity<>(studentService.getStudentByName(name), HttpStatus.OK);
    }
}
