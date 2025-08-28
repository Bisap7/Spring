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
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name = "striker")
    private String strikerName;

    @Column(name = "jersey_number")
    private Long jerseyNumber;

    @Column(name="goal_scored")
    private Long goalScored;

    @Column(name = "league_name")
    private String leagueName;
}
