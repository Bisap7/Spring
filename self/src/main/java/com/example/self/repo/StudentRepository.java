package com.example.self.repo;

import com.example.self.entity.Student;
import com.example.self.pojo.StaffResPojo;
import com.example.self.pojo.StudentResPojo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT s.id, s.student_name AS studentName, s.student_roll AS rollNumber, s.student_house AS studentHouse, s.student_phone_number AS studentPhoneNumber FROM student s", nativeQuery = true)
    List<StudentResPojo> getAllStudent();

    @Modifying
    @Transactional
    @Query(value = "UPDATE student s SET s.student_name = :name, s.student_roll = :roll, s.student_house = :house, s.student_phone_number = :phone WHERE s.id = :id", nativeQuery = true)
    int updateStudentById(Long id, String name, String roll, String house, String phone);

    List<Student> id(Long id);
}
