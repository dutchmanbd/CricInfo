package com.zxdmjr.cricinfo.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by eict on 11/29/17.
 */

public class Match {

    @SerializedName("unique_id")
    private String uniqueId;
    @SerializedName("team-2")
    private String team2;
    @SerializedName("team-1")
    private String team1;
    @SerializedName("type")
    private String type;
    @SerializedName("date")
    private String date;
    @SerializedName("dateTimeGMT")
    private String dateTimeGMT;
    @SerializedName("squad")
    private String squad;
    @SerializedName("toss_winner_team")
    private String tossWinnerTeam;
    @SerializedName("winner_team")
    private String winnerTeam;
    @SerializedName("matchStarted")
    private String matchStarted;

    public Match(String uniqueId, String team2, String team1, String type, String date, String dateTimeGMT, String squad, String tossWinnerTeam, String winnerTeam, String matchStarted) {
        this.uniqueId = uniqueId;
        this.team2 = team2;
        this.team1 = team1;
        this.type = type;
        this.date = date;
        this.dateTimeGMT = dateTimeGMT;
        this.squad = squad;
        this.tossWinnerTeam = tossWinnerTeam;
        this.winnerTeam = winnerTeam;
        this.matchStarted = matchStarted;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateTimeGMT() {
        return dateTimeGMT;
    }

    public void setDateTimeGMT(String dateTimeGMT) {
        this.dateTimeGMT = dateTimeGMT;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public String getTossWinnerTeam() {
        return tossWinnerTeam;
    }

    public void setTossWinnerTeam(String tossWinnerTeam) {
        this.tossWinnerTeam = tossWinnerTeam;
    }

    public String getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(String winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

    public String getMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(String matchStarted) {
        this.matchStarted = matchStarted;
    }
}
