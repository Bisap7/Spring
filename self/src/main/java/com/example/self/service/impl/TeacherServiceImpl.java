package com.example.self.service.impl;


import com.example.self.entity.Teacher;
import com.example.self.pojo.TeacherReqPojo;
import com.example.self.pojo.TeacherResPojo;
import com.example.self.repo.TeacherRepository;
import com.example.self.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;

    public String savesTeacher(TeacherReqPojo teacherReqPojo){
        Teacher teacher= new Teacher();
        teacher.setName(teacherReqPojo.getName());
                teacher.setNumber(teacherReqPojo.getNumber());
                teacher.setSubject(teacherReqPojo.getSubject());
        teacherRepository.save(teacher);



                return teacher.getName();
    }

    @Override
    public Long deleteTeacher(Long teacherId) {
        Teacher teacher= teacherRepository.findById(teacherId).orElseThrow();
        teacherRepository.delete(teacher);
        return teacher.getId();
    }

    @Override
    public List<TeacherResPojo> getTeacher() {
        List<TeacherResPojo> teacherResPojos = teacherRepository.getAllTeacher();
        return teacherResPojos;
    }

    @Override
    public List<TeacherResPojo> getTeacherName() {
        return teacherRepository.getTeacherName();
    }


}
