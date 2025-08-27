package com.example.self.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class StaffResPojo {
    public StaffResPojo(long id, String firstName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    private long id;

    private String firstName;


    private String lastName;


    private String phoneNumber;


}
