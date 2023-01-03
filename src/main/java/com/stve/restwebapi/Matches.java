package com.stve.restwebapi;

import java.util.ArrayList;
import java.util.List;

public class Matches {
    private List<Match> matchList;

    public List<Match> getMatchList() {
        if (matchList==null)
            matchList=new ArrayList<>();
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }
}
