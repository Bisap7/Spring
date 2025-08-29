package com.example.self.service;

import com.example.self.pojo.StudentReqPojo;
import com.example.self.pojo.StudentResPojo;

import java.util.List;

public interface StudentService {

    Long savesStudent (StudentReqPojo studentReqPojo);
    List<StudentResPojo> getStudent();

    Long updateById(Long id, StudentReqPojo studentReqPojo);

    Long deleteStudent(Long studentId);
}
