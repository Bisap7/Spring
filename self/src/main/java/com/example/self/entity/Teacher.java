package com.example.self.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Teacher")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

    @Column(name = "full_name", nullable = false)
    private String name;

    @Column(name = "phone_number", nullable = false)
    private Long number;

    @Column(name = "subject")
    private String subject;
}
