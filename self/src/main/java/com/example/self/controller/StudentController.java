package com.example.self.controller;

import com.example.self.pojo.StaffReqPojo;
import com.example.self.pojo.StudentReqPojo;
import com.example.self.pojo.StudentResPojo;
import com.example.self.pojo.TeacherResPojo;
import com.example.self.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public ResponseEntity<Long> addStudent(@RequestBody StudentReqPojo studentReqPojo) {
        Long student = studentService.savesStudent(studentReqPojo);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/view")
    public ResponseEntity<List<StudentResPojo>>studentinfo(){
        List<StudentResPojo> studentList = studentService.getStudent();
        return new ResponseEntity<>(studentList, HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updateStudent(@PathVariable Long id, @RequestBody StudentReqPojo studentReqPojo) {
        return new ResponseEntity<>(studentService.updateById(id, studentReqPojo), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteStudent (@PathVariable Long id){
        Long studentId= studentService.deleteStudent(id);
        return new ResponseEntity<>(studentId, HttpStatus.OK);
    }


}
