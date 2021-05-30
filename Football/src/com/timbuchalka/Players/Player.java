package com.timbuchalka.Players;

import com.timbuchalka.Countries.Country;
import com.timbuchalka.Teams.Team;

public class Player implements IPlayer{
    private String name;
    private int age;
    private Country country;
    private String position;
    private Team team;

    public Player(String name, int age, Country country, String position) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.position = position;
        this.team = null;
    }

    public Player(String name, int age, Country country, String position, Team team) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.position = position;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void info(){
        System.out.println("Name : " + getName() + "\n" +
                "Age : " + getAge() + "\n" +
                "Nationality : " + getCountry() + "\n" +
                "Position : " + getPosition() + "\n" +
                "Current Team : " + getTeam());
    }
}
