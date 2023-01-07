package com.stve.restwebapi.service;

import com.stve.restwebapi.entity.Match;
import com.stve.restwebapi.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MatchServiceImpl implements MatchService{

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Match saveMatch(Match match){
        return matchRepository.save(match);
    }

    @Override
    public List<Match> fetchMatchList(){
        return matchRepository.findAll();
    }

    @Override
    public Match updateMatch(Match match,Integer matchId)
    {
        Match matchDB=matchRepository.findById(matchId).get();

        if (Objects.nonNull(match.getDescription())&&!"".equalsIgnoreCase(match.getDescription()))
        {
            matchDB.setDescription(match.getDescription());
        }

        if (Objects.nonNull(match.getMatch_date())){
            matchDB.setMatch_date(match.getMatch_date());
        }

        if (Objects.nonNull(match.getMatch_time())){
            matchDB.setMatch_time(match.getMatch_time());
        }

        if (Objects.nonNull(match.getTeam_a())&&!"".equalsIgnoreCase(match.getTeam_a()))
        {
            matchDB.setTeam_a(match.getTeam_a());
        }

        if (Objects.nonNull(match.getTeam_b())&&!"".equalsIgnoreCase(match.getTeam_b()))
        {
            matchDB.setTeam_b(match.getTeam_b());
        }

        if (Objects.nonNull(match.getSport()))
        {
            matchDB.setSport(match.getSport());
        }

        return matchRepository.save(matchDB);
    }

    @Override
    public void deleteMatchById(Integer matchId)
    {
        matchRepository.deleteById(matchId);
    }
}
