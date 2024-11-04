package com.stve.restwebapi.service;

import com.stve.restwebapi.entity.Match;
import com.stve.restwebapi.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

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
        System.out.println("Fetching Match List");
        return matchRepository.findAll();
    }

    @Override
    @Transactional
    public Match updateMatch(Match match,Integer matchId)
    {
       Optional<Match> optionalMatch=matchRepository.findById(matchId);

       if (optionalMatch.isEmpty())
           throw new NoSuchElementException("Match not found with id: "+matchId);

        Match matchDB=optionalMatch.get();

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
