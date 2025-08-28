package com.example.self.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerResPojo {

    private Long id;

    private String strikerName;


    private Long jerseyNumber;


    private Long goalScored;


    private String leagueName;
}
