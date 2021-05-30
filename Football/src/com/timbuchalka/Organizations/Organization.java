package com.timbuchalka.Organizations;

import com.timbuchalka.Federations.Federation;
import com.timbuchalka.Tournaments.Tournament;

import java.util.List;

public class Organization implements IOrganization {
    private static Organization organization;

    private List<Federation> federations;
    private List<Tournament> tournaments;

    private Organization() {

    }

    public static Organization getInstance(){
        if(organization == null)
        {
            organization = new Organization();
        }

        return organization;
    }

    public List<Federation> getFederations() {
        return federations;
    }

    public void setFederation(Federation federation) {
        federations.add(federation);
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournament(Tournament tournament) {
        tournaments.add(tournament);
    }

    public void getTournamentInfo(String tournamentName){

    }

    public void getFederationInfo(String federationName){

    }
}
