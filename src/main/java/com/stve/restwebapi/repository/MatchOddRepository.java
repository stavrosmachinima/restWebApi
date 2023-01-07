package com.stve.restwebapi.repository;

import com.stve.restwebapi.entity.MatchOdds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchOddRepository extends JpaRepository<MatchOdds,Integer> {

}
