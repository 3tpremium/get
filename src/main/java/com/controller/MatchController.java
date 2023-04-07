package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.IMatchService;
import com.entity.Match;

@RestController
@RequestMapping("/api")
public class MatchController {
        @Autowired
        private IMatchService matchService;

        @GetMapping("/matches")
        public ResponseEntity<ArrayList<Match>> findAll() {
                return new ResponseEntity<>(matchService.findAll(), HttpStatus.OK);
        }

        @GetMapping("/match/create")
        public ResponseEntity<Boolean> create(Match match) {
                return new ResponseEntity<>(matchService.create(match), HttpStatus.OK);
        }

}
