package com.example.self.service;

import com.example.self.pojo.TeacherReqPojo;
import com.example.self.pojo.TeacherResPojo;

import java.util.List;

public interface TeacherService  {
    String savesTeacher(TeacherReqPojo teacherReqPojo);

    Long deleteTeacher(Long teacherId);

    List<TeacherResPojo> getTeacher();

    List<TeacherResPojo> getTeacherName();

}
