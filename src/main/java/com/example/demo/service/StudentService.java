package com.example.demo.service;

import com.example.demo.model.Point;
import com.example.demo.model.Student;
import com.example.demo.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepo studentRepo;

    @Override
    public Iterable<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Iterable<Point> getAllPointByIdStudent(Long id) {
        return studentRepo.getAllPointByIdStudent(id);
    }

    @Override
    public Student getStudentByName(String name) {
        return studentRepo.getStudentByName(name);
    }
}
