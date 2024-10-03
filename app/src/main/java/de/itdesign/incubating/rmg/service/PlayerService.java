package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Player;
import de.itdesign.incubating.rmg.model.Role;

import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class PlayerService {

    public List<Player> players=new ArrayList<>();

    public PlayerService(){
        players.add(new Player("player1", Role.RM,"Gowtham",List.of(100)));
        players.add(new Player("player2",Role.PM,"Bharath",List.of(40)));
        players.add(new Player("player3", Role.PM,"Kamal",List.of(20)));
        players.add(new Player("player4",Role.RM,"Bhagyasri",List.of(40)));
        players.add(new Player("player5",Role.PM,"Roy",List.of(30)));
        System.out.println("SDf");
    }
    public List<Player> getAllPlayers(){
        return  players;
    }

}
