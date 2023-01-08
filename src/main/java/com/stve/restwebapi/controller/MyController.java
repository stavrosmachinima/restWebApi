package com.stve.restwebapi.controller;
import com.stve.restwebapi.entity.Match;
import com.stve.restwebapi.entity.MatchOdds;
import com.stve.restwebapi.service.MatchOdssService;
import com.stve.restwebapi.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchOdssService matchOdssService;

    @GetMapping( "/matchesOdds")
    public List<MatchOdds> getMatchesOdds(){
        System.out.println("Searching for all matches odds");
        return matchOdssService.fetchMatchOddsList();
    }

    @PostMapping("/matchesOdds")
    public MatchOdds saveMatchOdds(@RequestBody MatchOdds matchOdds)
    {
        return matchOdssService.saveMatchOdds(matchOdds);
    }

    @PutMapping("/matchesOdds/{id}")
    public MatchOdds updateMatchOdds(@RequestBody MatchOdds matchOdds,@PathVariable("id") Integer matchId){
        return matchOdssService.updateMatchOdds(matchOdds, matchId);
    }

    @DeleteMapping("matchesOdds/{id}")
    public String deleteMatchOddsById(@PathVariable("id") Integer matchId)
    {
        matchOdssService.deleteMatchOddsById(matchId);
        return "Deleted "+matchId;
    }

    @GetMapping( "/matches")
    public List<Match> getMatches(){
        System.out.println("Searching for all matches");
        return matchService.fetchMatchList();
    }

    @PostMapping("/matches")
    public Match saveMatch(@RequestBody Match match)
    {
        return matchService.saveMatch(match);
    }

    @PutMapping("/matches/{id}")
    public Match updateMatch(@RequestBody Match match,@PathVariable("id") Integer matchId){
        return matchService.updateMatch(match, matchId);
    }

    @DeleteMapping("matches/{id}")
    public String deleteMatchById(@PathVariable("id") Integer matchId)
    {
        matchService.deleteMatchById(matchId);
        return "Deleted "+matchId;
    }
}
