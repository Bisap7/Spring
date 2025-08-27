package com.example.self.service.impl;

import com.example.self.entity.Staff;
import com.example.self.pojo.StaffReqPojo;
import com.example.self.pojo.StaffResPojo;
import com.example.self.repo.StaffRepository;
import com.example.self.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {
    private final StaffRepository staffRepository;


    @Override

    public Long savesStaff(StaffReqPojo staffReqPojo) {
        Staff staff = new Staff();
        staff.setFirstName(staffReqPojo.getFirstName());
        staff.setLastName(staffReqPojo.getLastName());
        staff.setNumber(staffReqPojo.getNumber());
        staff.setAddress(staffReqPojo.getAddress());
        staff.setPosition(staffReqPojo.getPosition());
        staff.setDate(staffReqPojo.getDate());

        String position = staffReqPojo.getPosition();


        if (Objects.equals(position, "hr")) {
            staff.setSalary("100000");
        } else if (Objects.equals(position, "ceo")) {
            staff.setSalary("500000");
        } else if (Objects.equals(position, "teacher")) {
            staff.setSalary("50000");
        }
        staffRepository.save(staff);


        return staff.getId();
    }

    @Override
    public Long deleteById(Long id) {
        Staff staff = staffRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id not found"));

        staffRepository.delete(staff);

        return id;
    }

    @Override
    public List<StaffResPojo> getStaff() {
        List<StaffResPojo> staffResPojo= staffRepository.getAllStaff();


        return staffResPojo;
    }

    @Override
    public List<StaffResPojo> getStaffInfo() {
        List<StaffResPojo> staffResPojos= staffRepository.getStaffDetail();
        return staffResPojos;
    }



    @Override
    public Long updateById(Long id, StaffReqPojo staffReqPojo) {
        Staff staff = staffRepository.findById(id).orElseThrow(()-> new RuntimeException("ID not found"));

        staff.setFirstName(staffReqPojo.getFirstName());

        staffRepository.save(staff);


        return id;
    }





}
