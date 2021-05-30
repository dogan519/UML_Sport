package com.timbuchalka.Teams;

import com.timbuchalka.Players.Player;

public interface ITeam {
    void info();

    void setPlayer(Player player, Team team);

    void removePlayer(Player player);
}
