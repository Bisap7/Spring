package com.example.self.controller;


import com.example.self.pojo.TeacherReqPojo;
import com.example.self.pojo.TeacherResPojo;
import com.example.self.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teacher")
@RequiredArgsConstructor

public class TeacherController {
    private final TeacherService teacherService;

    @PostMapping("/create")
    public ResponseEntity<String> addTeacher (@RequestBody TeacherReqPojo teacherReqPojo){
        String name= teacherService.savesTeacher(teacherReqPojo);
        return new ResponseEntity<>(name, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteTeacher (@PathVariable Long id){
        Long teacherId= teacherService.deleteTeacher(id);
        return new ResponseEntity<>(teacherId, HttpStatus.OK);
    }

    @GetMapping("/teacher-list")
    public ResponseEntity<List<TeacherResPojo>>teacherList(){
        List<TeacherResPojo> teacherList = teacherService.getTeacher();
        return new ResponseEntity<>(teacherList, HttpStatus.OK);
    }

    @GetMapping("/id-name")
    public ResponseEntity<List<TeacherResPojo>>teacherNameId(){
        List<TeacherResPojo> teacherNameId = teacherService.getTeacherName();
        return new ResponseEntity<>(teacherNameId, HttpStatus.OK);
    }

}
