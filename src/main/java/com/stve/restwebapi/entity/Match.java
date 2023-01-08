package com.stve.restwebapi.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name="game")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Nonnull
    private Integer id;
    @Nonnull
    @Column(name = "DESCRIPTION")
    private String description;
    @Nonnull
    @Column(name = "MATCH_DATE")
    private LocalDate match_date;
    @Nonnull
    @Column(name = "MATCH_TIME")
    private LocalTime match_time;
    @Nonnull
    @Column(name="TEAM_A")
    private String team_a;
    @Nonnull
    @Column(name="TEAM_B")
    private String team_b;
    @Nonnull
    @Enumerated(EnumType.ORDINAL)
    @Column(name="Sport")
    private Sport sport;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "match",cascade = CascadeType.ALL)
    private Set<MatchOdds> matchOdds;

    public Match(){
        super();
    }

    public Match(Integer id, String description, LocalDate match_date, LocalTime match_time, String team_a, String team_b, Sport sport, Set<MatchOdds> matchOdds) {
        super();
        this.id = id;
        this.description = description;
        this.match_date = match_date;
        this.match_time = match_time;
        this.team_a = team_a;
        this.team_b = team_b;
        this.sport = sport;
        this.matchOdds = matchOdds;
    }

    public Set<MatchOdds> getMatchOdds() {
        return matchOdds;
    }

    public void setMatchOdds(Set<MatchOdds> matchOdds) {
        this.matchOdds = matchOdds;
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
