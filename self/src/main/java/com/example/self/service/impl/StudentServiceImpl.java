package com.example.self.service.impl;

import com.example.self.entity.Staff;
import com.example.self.entity.Student;
import com.example.self.entity.Teacher;
import com.example.self.pojo.StudentReqPojo;
import com.example.self.pojo.StudentResPojo;
import com.example.self.repo.StudentRepository;
import com.example.self.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Long savesStudent(StudentReqPojo studentReqPojo) {
        Student student = new Student();
        student.setStudentName(studentReqPojo.getStudentName());
        student.setRollNumber(studentReqPojo.getRollNumber());
        student.setStudentHouse(studentReqPojo.getStudentHouse());
        student.setStudentPhoneNumber(studentReqPojo.getStudentPhoneNumber());

        studentRepository.save(student);
        return student.getId();
    }

    @Override
    public List<StudentResPojo> getStudent() {
        List<StudentResPojo> list= (studentRepository.getAllStudent());
        return list;
    }

    @Override
    public Long updateById(Long id, StudentReqPojo studentReqPojo) {
        Student student = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("ID not found"));

        student.setStudentName(studentReqPojo.getStudentName());

        studentRepository.save(student);


        return id;

    }

    @Override
    public Long deleteStudent(Long studentId) {
        Student student= studentRepository.findById(studentId).orElseThrow();
        studentRepository.delete(student);
        return student.getId();
    }
}
