package com.timbuchalka.Leagues;

import com.timbuchalka.Countries.Country;
import com.timbuchalka.Federations.Federation;
import com.timbuchalka.Players.Player;
import com.timbuchalka.Teams.Team;
import com.timbuchalka.Tournaments.Tournament;

import java.util.List;

public class League implements ILeague{
    private String name;
    private List<Team> teams;
    private List<Player> nationalTeam;
    private Federation federation;
    private Team lastChampion;
    private List<Tournament> tournaments;
    private Country country;
    private int squadSize = 23;

    public League(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public League(String name, List<Team> teams, List<Player> nationalTeam, Federation federation, Country country) {
        this.name = name;
        this.teams = teams;
        this.nationalTeam = nationalTeam;
        this.federation = federation;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Player> getNationalTeam() {
        return nationalTeam;
    }

    public void setNationalTeam(List<Player> nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public Federation getFederation() {
        return federation;
    }

    public void setFederation(Federation federation) {
        this.federation = federation;
    }

    public Team getLastChampion() {
        return lastChampion;
    }

    public void setLastChampion(Team lastChampion) {
        this.lastChampion = lastChampion;
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public Country getCountry() {
        return country;
    }

    public void setTeam(Team team){
        this.teams.add(team);
    }

    public void setPlayer(Player player){
        if(player.getCountry().equals(getCountry()))
        {
            if(nationalTeam.contains(player)){
                System.out.println("Player is already in team!");
            }else{
                if(nationalTeam.size() < squadSize) {
                    nationalTeam.add(player);
                    System.out.println("Player added to team");
                }else{
                    System.out.println("Warning! Squad size is full.");
                }
            }
        }
        else{
            System.out.println("Nationality of player did not match!");
        }
    }

    public void removePlayer(Player player){
        if(nationalTeam.contains(player)){
            nationalTeam.remove(player);
        }else {
            System.out.println("Player already does not in team.");
        }
    }

    @Override
    public void info() {
        System.out.println("League Name : " + getName() + "\n" +
                "Country : " + getCountry().getName() + "\n" +
                "Federation : " + getFederation().getName() + "\n" +
                "Number of participants : " + getTeams().size() + "\n" +
                "Tournaments : " + getTournaments().toString() + "\n" +
                "Last Champion : " + getLastChampion().getName());

    }
}
