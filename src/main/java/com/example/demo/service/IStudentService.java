package com.example.demo.service;

import com.example.demo.model.Point;
import com.example.demo.model.Student;

public interface IStudentService extends IGeneralService<Student> {
    Iterable<Point> getAllPointByIdStudent(Long id);

    Student getStudentByName(String name);
}
