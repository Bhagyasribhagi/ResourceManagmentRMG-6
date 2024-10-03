package de.itdesign.incubating.rmg.controller;


import de.itdesign.incubating.rmg.model.Player;
import de.itdesign.incubating.rmg.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ResourceBoardController {


    @Autowired
    PlayerService playerService;

   @MessageMapping("/getPlayers")
   @SendTo("/topic/players")
   public List<Player> getAllPlayers(){
       return playerService.getAllPlayers();
   }





}
