package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Match;

public interface IMatchRepository extends JpaRepository<Match, Long> {

    Match findByName(String name);
}
