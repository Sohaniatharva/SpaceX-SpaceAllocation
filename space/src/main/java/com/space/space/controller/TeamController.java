package com.space.space.controller;

import com.space.space.model.Team;
import com.space.space.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping("/team")
    public Team addTeam(@RequestBody Team team){
        return teamService.addTeam(team);
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @GetMapping("/team/{teamId}")
    public Team getTeamById(@PathVariable String teamId){
        return teamService.getTeamById(teamId);
    }

    @DeleteMapping("/team/{teamId}")
    public boolean deleteByTeamId(@PathVariable String teamId){
        return teamService.deleteTeamById(teamId);
    }

    @PutMapping("/team")
    public Team updateTeam(@RequestBody Team team){
        return teamService.updateTeam(team);
    }
}