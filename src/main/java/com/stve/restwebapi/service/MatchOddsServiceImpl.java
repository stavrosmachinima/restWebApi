package com.stve.restwebapi.service;

import com.stve.restwebapi.entity.MatchOdds;
import com.stve.restwebapi.repository.MatchOddsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

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
    @Transactional
    public MatchOdds updateMatchOdds(MatchOdds matchOdds,Integer matchOddsId){
        Optional<MatchOdds> optionalMatchOdds=matchOddsRepository.findById(matchOddsId);

        if (optionalMatchOdds.isEmpty())
            throw new NoSuchElementException("Match not found with id: "+matchOddsId);

        MatchOdds matchOddsDB=optionalMatchOdds.get();

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
