package com.example.self.controller;

import com.example.self.pojo.StaffReqPojo;
import com.example.self.pojo.StaffResPojo;
import com.example.self.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/staff")
public class StaffController {

    private final StaffService staffService;


    @PostMapping("/request")
    public ResponseEntity<Long> addStaff(@RequestBody StaffReqPojo staffReqPojo) {
        Long name = staffService.savesStaff(staffReqPojo);
        return new ResponseEntity<>(name, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteStaff(@PathVariable Long id) {
        return new ResponseEntity<>(staffService.deleteById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<StaffResPojo>> getStaff() {
        return new ResponseEntity<>(staffService.getStaff(), HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity<List<StaffResPojo>> getStaffInfor() {
        return new ResponseEntity<>(staffService.getStaffInfo(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updateStaff(@PathVariable Long id, @RequestBody StaffReqPojo staffReqPojo) {
        return new ResponseEntity<>(staffService.updateById(id, staffReqPojo), HttpStatus.OK);
    }


}
