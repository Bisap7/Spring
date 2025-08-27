package com.example.self.repo;

import com.example.self.entity.Staff;
import com.example.self.pojo.StaffResPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    @Query(value = "SELECT s.id AS id, s.first_name AS firstName, s.last_name AS lastName, s.phonenumber AS phoneNumber FROM staff s",
            nativeQuery = true)
    List<StaffResPojo> getAllStaff();

    @Query("SELECT new com.example.self.pojo.StaffResPojo(s.Id, s.firstName, s.number)FROM Staff s")
    List<StaffResPojo> getStaffDetail();
}
