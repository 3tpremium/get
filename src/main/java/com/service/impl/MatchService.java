package com.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Match;
import com.repository.IMatchRepository;
import com.service.IMatchService;

@Service
public class MatchService implements IMatchService {

    @Autowired
    private IMatchRepository matchRepository;

    @Override
    public ArrayList<Match> findAll() {
        return (ArrayList<Match>) matchRepository.findAll();
    }

    @Override
    public boolean create(Match match) {
        if (matchRepository.findByName(match.getName()) != null) {
            return false;
        }
        matchRepository.save(match);
        return true;
    }

}
