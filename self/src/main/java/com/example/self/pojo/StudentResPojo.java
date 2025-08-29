package com.example.self.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class StudentResPojo {

    private Long id;


    private String studentName;


    private Long rollNumber;


    private String studentHouse;


    private Long studentPhoneNumber;
}
