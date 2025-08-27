package com.example.self.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherResPojo {
    public TeacherResPojo(Long id, Long number) {
        this.id = id;
        this.number = number;
    }

    private Long id;


    private String name;


    private Long number;

    private String subject;
}
