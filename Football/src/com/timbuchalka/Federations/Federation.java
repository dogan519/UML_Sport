package com.timbuchalka.Federations;

import com.timbuchalka.Leagues.League;
import com.timbuchalka.Organizations.Organization;
import com.timbuchalka.Tournaments.Tournament;

import java.util.List;

public class Federation implements IFederation{
    private String name;
    private List<League> leagues;
    private List<Tournament> tournaments;
    private Organization organization;

    public Federation(String name) {
        this.name = name;
    }

    public Federation(String name, Organization organization) {
        this.name = name;
        this.organization = organization;
    }

    public Federation(String name, List<League> leagues, List<Tournament> tournaments) {
        this.name = name;
        this.leagues = leagues;
        this.tournaments = tournaments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public void setLeague(League league) {
        this.leagues.add(league);
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(Tournament tournament) {
        this.tournaments.add(tournament);
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public void info() {
        System.out.println("Federation Name : " + getName() + "\n" +
                "Leagues : " + getLeagues().toString() + "\n" +
                "Tournaments : " + getTournaments().toString());

    }
}
