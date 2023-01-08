package com.stve.restwebapi.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name="matchodds")
public class MatchOdds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Nonnull
    private Integer id;
    @Nonnull
    @Column(name = "match_id")
    private Integer match_id;
    @Nonnull
    @Column(name = "specifier")
    private Character specifier;
    @Nonnull
    @Column(name = "odd")
    private Double odd;

    //To load it on-demand (i.e. lazily) when you call the getMatch() method.
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "id",insertable = false,updatable = false) //counter the probability to update id from two places
    private Match match;

    public MatchOdds(){
        super();
    }
    public MatchOdds(Integer id, Integer match_id, Character specifier, Double odd, Match match) {
        super();
        this.id = id;
        this.match_id = match_id;
        this.specifier = specifier;
        this.odd = odd;
        this.match = match;
    }

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

}
