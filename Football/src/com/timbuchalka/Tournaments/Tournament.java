package com.timbuchalka.Tournaments;

import com.timbuchalka.Teams.Team;

import java.util.List;

public class Tournament implements ITournament{
    private String name;
    private int size;
    private List<Team> teams;

    public Tournament(String name, int size) {
        this.name = name;
        this.size = size;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void setTeam(Team team){
        if(teams.contains(team)){
            System.out.println("Team is already in tournament.");
        }else{
            if(teams.size() + 1 <= size)
                teams.add(team);
            else
                System.out.println("There is no place to add team to the tournament.");
        }
    }

    public void removeTeam(Team team){
        if(teams.contains(team)) {
            teams.remove(team);
        }else {
            System.out.println("Team already does not exist in tournament.");
        }
    }
}
