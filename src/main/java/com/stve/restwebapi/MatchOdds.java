package com.stve.restwebapi;

public class MatchOdds {
    private Integer id;
    private Integer match_id;
    private Character specifier;
    private Double odd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Integer match_id) {
        this.match_id = match_id;
    }

    public Character getSpecifier() {
        return specifier;
    }

    public void setSpecifier(Character specifier) {
        this.specifier = specifier;
    }

    public Double getOdd() {
        return odd;
    }

    public void setOdd(Double odd) {
        this.odd = odd;
    }

    @Override
    public String toString() {
        return "MatchOdds{" +
                "id=" + id +
                ", match_id=" + match_id +
                ", specifier=" + specifier +
                ", odd=" + odd +
                '}';
    }

    public MatchOdds(Integer id, Integer match_id, Character specifier, Double odd) {
        this.id = id;
        this.match_id = match_id;
        this.specifier = specifier;
        this.odd = odd;
    }
}
