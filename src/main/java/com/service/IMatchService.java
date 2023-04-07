package com.service;

import java.util.ArrayList;

import com.entity.Match;

public interface IMatchService {
    ArrayList<Match> findAll();

    boolean create(Match match);
}
