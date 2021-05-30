package com.timbuchalka.Countries;

import com.timbuchalka.Leagues.League;

public class Country {
    private String name;
    private League league;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
