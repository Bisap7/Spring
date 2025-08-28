package com.example.self.repo;

import com.example.self.entity.Player;
import com.example.self.pojo.PlayerResPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PlayerRepository extends JpaRepository<Player,Long> {
    @Query(value = "SELECT t.ID AS id, t.striker AS strikerName, t.jersey_number AS jerseyNumber, t.goal_scored AS goalScored, t.league_name AS leagueName from player t",nativeQuery = true)
    List<PlayerResPojo> getAllPlayer();



}
