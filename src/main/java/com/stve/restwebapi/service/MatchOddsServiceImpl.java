package com.stve.restwebapi.service;

import com.stve.restwebapi.entity.MatchOdds;
import com.stve.restwebapi.repository.MatchOddsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MatchOddsServiceImpl implements MatchOdssService {

    @Autowired
    private MatchOddsRepository matchOddsRepository;

    @Override
    public MatchOdds saveMatchOdds(MatchOdds matchOdds){
        return matchOddsRepository.save(matchOdds);
    }

    @Override
    public List<MatchOdds> fetchMatchOddsList(){
        return matchOddsRepository.findAll();
    }

    @Override
    public MatchOdds updateMatchOdds(MatchOdds matchOdds,Integer matchOddsId){
        MatchOdds matchOddsDB=matchOddsRepository.findById(matchOddsId).get();

        if (Objects.nonNull(matchOdds.getOdd()))
        {
            matchOddsDB.setOdd(matchOdds.getOdd());
        }

        if (Objects.nonNull(matchOdds.getMatch_id())){
            matchOddsDB.setMatch_id(matchOdds.getMatch_id());
        }

        if (Objects.nonNull(matchOdds.getSpecifier())&&' '!=matchOdds.getSpecifier()){
            matchOddsDB.setSpecifier(matchOdds.getSpecifier());
        }

        return matchOddsRepository.save(matchOddsDB);
    }

    @Override
    public void deleteMatchOddsById(Integer matchOddsId){
        matchOddsRepository.deleteById(matchOddsId);
    }
}
