package com.example.self.service;

import com.example.self.pojo.PlayerReqPojo;
import com.example.self.pojo.PlayerResPojo;

import java.util.List;


public interface PlayerService  {
    Long savesPlayer(PlayerReqPojo playerReqPojo);

    List<PlayerResPojo> getInfo();
}
