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
@Table(name="staff")
public class Staff {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)

    private Long Id;

    @Column (name="first_name")
    private String firstName;

    @Column (name="last_name")
    private String lastName;

    @Column (name="phonenumber")
    private String number;

    @Column (name="address")
    private String address;

    @Column (name="position")
    private String position;

    @Column (name="salary")
    private String salary;

    @Column (name="joined_date")
    private String date;



}
