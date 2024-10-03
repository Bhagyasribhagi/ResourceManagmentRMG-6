package de.itdesign.incubating.rmg.controller;

import de.itdesign.incubating.rmg.model.*;
import de.itdesign.incubating.rmg.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
//@Controller
public class ProjectManagerController {


    Game newGame = new Game();
    Player resourceManger = new Player("2", Role.RM, "Bharath", List.of(1, 2));
    @GetMapping("/get-game")
    public Player getPlan(){
        System.out.println(resourceManger.id());
        System.out.println(resourceManger);
        return resourceManger;
    }
    @Autowired
    GameService gameService;

    @GetMapping("/get-project/{id}")
    public List<ProjectPlan> getProjectByPlayerId(@PathVariable("id") int id) {
        return gameService.getProjectByPlayerId(id);
    }
}
