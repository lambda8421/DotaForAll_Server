package com.mofei.dota.web.repository;

import com.mofei.dota.web.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match,Long> {

    @Override
    Optional<Match> findById(Long aLong);
}
