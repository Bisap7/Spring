package com.example.self.service.impl;

import com.example.self.entity.Player;
import com.example.self.pojo.PlayerReqPojo;
import com.example.self.pojo.PlayerResPojo;
import com.example.self.repo.PlayerRepository;
import com.example.self.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Override
    public Long savesPlayer(PlayerReqPojo playerReqPojo) {
        Player player = new Player();

        player.setStrikerName(playerReqPojo.getStrikerName());
        player.setJerseyNumber(playerReqPojo.getJerseyNumber());
        player.setGoalScored(playerReqPojo.getGoalScored());
        player.setLeagueName(playerReqPojo.getLeagueName());

        Player savedPlayer = playerRepository.save(player);
        return savedPlayer.getId();
    }

    @Override
    public List<PlayerResPojo> getInfo() {
        List<PlayerResPojo> list= playerRepository.getAllPlayer();
        return list;
    }
}
