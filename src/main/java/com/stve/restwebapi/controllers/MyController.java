package com.stve.restwebapi.controllers;
import com.stve.restwebapi.Matches;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/matches")
public class MyController {

    @GetMapping(path="/",produces = "application/json")
    public Matches getMatches(){

    }
}
