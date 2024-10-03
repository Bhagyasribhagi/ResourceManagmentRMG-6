package de.itdesign.incubating.rmg.service;

import de.itdesign.incubating.rmg.model.Game;
import de.itdesign.incubating.rmg.model.Project;
import de.itdesign.incubating.rmg.model.ProjectPlan;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    Game newGame = new Game();



    public List<ProjectPlan> getProjectByPlayerId(int playerId) {
        Game newGame = new Game();
        Collection<ProjectPlan> allProjects = newGame.getProjectPlans();
        List<ProjectPlan> projectPlans = allProjects.stream().filter(projectplan -> {
            return Integer.valueOf(projectplan.getOwner().id()) == playerId;
        }).toList();
        return projectPlans;
    }


}
