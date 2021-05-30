package com.timbuchalka.Leagues;

import com.timbuchalka.Players.Player;

public interface ILeague {
    void removePlayer(Player player);

    void setPlayer(Player player);

    void info();
}
