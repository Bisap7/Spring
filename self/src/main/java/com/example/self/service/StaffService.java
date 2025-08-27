package com.example.self.service;

import com.example.self.pojo.StaffReqPojo;
import com.example.self.pojo.StaffResPojo;

import java.util.List;

public interface StaffService {
    Long savesStaff(StaffReqPojo staffReqPojo);

    Long deleteById(Long id);

    List<StaffResPojo> getStaff();
    List<StaffResPojo> getStaffInfo();

    Long updateById(Long id, StaffReqPojo staffReqPojo);


}
