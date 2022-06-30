package com.example.demo.repo;

import com.example.demo.model.Point;
import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student, Long> {

    @Query(value = "select * from point where student_id = ?;", nativeQuery = true)
    Iterable<Point> getAllPointByIdStudent(Long id);

    @Query(value = "SELECT s FROM student as s WHERE lower(s.name)  LIKE lower(concat('%', :name, '%') ) ", nativeQuery = true)
    Student getStudentByName(String name);
}
