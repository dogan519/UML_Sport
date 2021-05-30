package com.timbuchalka;

import com.timbuchalka.Countries.Country;
import com.timbuchalka.Federations.Federation;
import com.timbuchalka.Leagues.League;
import com.timbuchalka.Organizations.Organization;
import com.timbuchalka.Players.Player;
import com.timbuchalka.Teams.Team;
import com.timbuchalka.Tournaments.Tournament;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Organization organization = Organization.getInstance();

        Federation UEFA = new Federation("UEFA", new ArrayList<>(), new ArrayList<>());
        League superLig = new League("Spor Toto Süper Lig", new ArrayList<>(), new ArrayList<>(),
                UEFA, new Country("Türkiye"));

        Tournament championsLeague= new Tournament("Şampiyonlar Ligi", 32);
        Team besiktas = new Team("Besiktas", new ArrayList<>());
        Team fenerbahce = new Team("Fenerbahçe", new ArrayList<>());
        Team barcelona = new Team("Barcelona", new ArrayList<>());

        Country turkey = new Country("Türkiye");
        Player player1 = new Player("Burak Yılmaz", 36, turkey, "Forvet",  null);
        Player player2 = new Player("Yusuf Yazıcı", 23, turkey, "Orta Saha",  null);
        Player player3 = new Player("Hakan Çalhanoğlu", 27, turkey, "Orta Saha",  null);
        Player player4 = new Player("Çağlar Söyüncü", 24 , turkey, "Defans",  null);

        besiktas.setPlayer(player1, besiktas);
        besiktas.setPlayer(player2, besiktas);
        fenerbahce.setPlayer(player1, fenerbahce);
        fenerbahce.setPlayer(player3, fenerbahce);
        barcelona.setPlayer(player3, barcelona);
        barcelona.setPlayer(player4, barcelona);

        System.out.print("\nPlayer of " + besiktas.getName() + " : ");
        besiktas.getSquad().forEach(player -> System.out.print(player.getName() + ", "));
        System.out.print("\nPlayer of " + fenerbahce.getName() + " : ");
        fenerbahce.getSquad().forEach(player -> System.out.print(player.getName() + ", "));
        System.out.print("\nPlayer of " + barcelona.getName() + " : ");
        barcelona.getSquad().forEach(player -> System.out.print(player.getName() + ", "));


        /*
        championsLeague.setTeam(besiktas);
        championsLeague.setTeam(fenerbahce);
        championsLeague.setTeam(barcelona);

        superLig.setLastChampion(besiktas);
        superLig.setTeam(fenerbahce);

        UEFA.setTournaments(championsLeague);
        fifa.setFederation(UEFA);
        UEFA.setLeague(superLig);

         */
    }
}
