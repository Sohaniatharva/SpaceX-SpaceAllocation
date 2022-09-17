package com.space.space.service;

import com.space.space.model.Team;
import com.space.space.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepo teamRepo;

    public List<Team> getAllTeams(){
        return teamRepo.findAll();
    }

    public Team addTeam(Team team){
        return teamRepo.save(team);
    }

    public Team updateTeam(Team team){
        return teamRepo.save(team);
    }

    public Team getTeamById(String teamId){
        return teamRepo.findById(teamId).get();
    }

    public boolean deleteTeamById(String teamId){
        teamRepo.deleteById(teamId);
        return !teamRepo.existsById(teamId);
    }
}
