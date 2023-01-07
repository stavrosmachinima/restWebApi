package com.stve.restwebapi.repository;

import com.stve.restwebapi.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match,Integer> {

}
