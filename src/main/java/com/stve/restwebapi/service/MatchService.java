package com.stve.restwebapi.service;

import com.stve.restwebapi.entity.Match;

import java.util.List;

public interface MatchService {
    Match saveMatch(Match game);

    List<Match> fetchMatchList();

    Match updateMatch(Match match,Integer id);

    void deleteMatchById(Integer id);
}
