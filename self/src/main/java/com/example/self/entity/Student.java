package com.example.self.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(name = "student_name")

    private String studentName;

    @Column(name = "student_roll")

    private Long rollNumber;

    @Column(name = "student_house")

    private String studentHouse;

    @Column(name = "student_phone_number")

    private Long studentPhoneNumber;
}
