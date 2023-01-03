package com.stve.restwebapi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Match {
    private Integer id;
    private String description;
    private LocalDate match_date;
    private LocalTime match_time;
    private String team_a;
    private String team_b;
    private enum sport{
        FOOTBALL,
        BASKETBALL
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getMatch_date() {
        return match_date;
    }

    public void setMatch_date(LocalDate match_date) {
        this.match_date = match_date;
    }

    public LocalTime getMatch_time() {
        return match_time;
    }

    public void setMatch_time(LocalTime match_time) {
        this.match_time = match_time;
    }

    public String getTeam_a() {
        return team_a;
    }

    public void setTeam_a(String team_a) {
        this.team_a = team_a;
    }

    public String getTeam_b() {
        return team_b;
    }

    public void setTeam_b(String team_b) {
        this.team_b = team_b;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", match_date=" + match_date +
                ", match_time=" + match_time +
                ", team_a='" + team_a + '\'' +
                ", team_b='" + team_b + '\'' +
                '}';
    }

    public Match(){

    }

    public Match(Integer id, String description, LocalDate match_date, LocalTime match_time, String team_a, String team_b) {
        this.id = id;
        this.description = description;
        this.match_date = match_date;
        this.match_time = match_time;
        this.team_a = team_a;
        this.team_b = team_b;
    }
}
