package com.example.self.controller;

import com.example.self.pojo.PlayerReqPojo;
import com.example.self.pojo.PlayerResPojo;
import com.example.self.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/player")
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping("/save")
    public ResponseEntity<Long> player(@RequestBody PlayerReqPojo playerReqPojo){
        Long id= playerService.savesPlayer(playerReqPojo);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping("/details")
    public ResponseEntity<List<PlayerResPojo>> details(){
        List<PlayerResPojo> list= playerService.getInfo();
        return new ResponseEntity<>(list,HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
