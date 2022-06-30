package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "point")
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;

    private int point;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Point() {
    }

    public Point(Long id, String subject, int point, Student student) {
        this.id = id;
        this.subject = subject;
        this.point = point;
        this.student = student;
    }

    public Point(String subject, int point, Student student) {
        this.subject = subject;
        this.point = point;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
