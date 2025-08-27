package com.example.self.repo;

import com.example.self.entity.Teacher;
import com.example.self.pojo.TeacherResPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query(value = "SELECT t.id AS id, t.full_name AS name, t.phone_number AS number, t.subject AS subject FROM teacher t",
            nativeQuery = true)
    List<TeacherResPojo> getAllTeacher();

    @Query("SELECT new com.example.self.pojo.TeacherResPojo(t.id, t.number) FROM Teacher t")
    List<TeacherResPojo> getTeacherName();


}


