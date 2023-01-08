package com.stve.restwebapi.service;

import com.stve.restwebapi.entity.MatchOdds;

import java.util.List;

public interface MatchOdssService {
    MatchOdds saveMatchOdds(MatchOdds matchOdds);

    List<MatchOdds> fetchMatchOddsList();

    MatchOdds updateMatchOdds(MatchOdds matchOdds,Integer id);

    void deleteMatchById(Integer id);
}
