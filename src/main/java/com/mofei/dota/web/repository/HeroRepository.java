package com.mofei.dota.web.repository;

import com.mofei.dota.web.entity.Hero;
import com.mofei.dota.web.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HeroRepository extends JpaRepository<Hero,Long> {

    @Override
    Optional<Hero> findById(Long aLong);

    @Override
    Page<Hero> findAll(Pageable pageable);

    List<Hero> findAllByRoles(List<Role> roles);

}
