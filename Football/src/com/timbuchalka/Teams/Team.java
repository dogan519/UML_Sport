package com.timbuchalka.Teams;

import com.timbuchalka.Leagues.League;
import com.timbuchalka.Players.Player;

import java.util.List;
import java.util.Scanner;

public class Team implements ITeam{
    private String name;
    private List<Player> squad;
    private League league;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, List<Player> squad) {
        this.name = name;
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getSquad() {
        return squad;
    }

    public void setSquad(List<Player> squad) {
        this.squad = squad;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setPlayer(Player player, Team team){
        if(player.getTeam() == null) {
            squad.add(player);
            player.setTeam(team);
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Player could not add to the squad. He is a player of " + player.getTeam().getName() + "." +
                    "Do you want to transfer him to " + team.getName());
            String decision = sc.next();
            if(decision.toLowerCase().equals("yes")){
                if (player.getTeam() != null) {
                    Team teamPlayer = player.getTeam();
                    teamPlayer.removePlayer(player);
                }
                player.setTeam(team);
                squad.add(player);
            }
        }
    }

    public void removePlayer(Player player){
        if(squad.contains(player)) {
            squad.remove(player);
        }else {
            System.out.println("Player is not in the squad.");
        }
    }

    public void info()
    {
        System.out.println("Club name : " + getName() + "\n" +
                "Country/Federation : " + getLeague() + "\n" +
                "Squad Size : " + squad.size() +
                "Players: ");


        getSquad().forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();
    }
}
