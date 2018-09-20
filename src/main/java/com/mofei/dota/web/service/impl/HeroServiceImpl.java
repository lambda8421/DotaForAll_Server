package com.mofei.dota.web.service.impl;

import com.mofei.dota.web.entity.Hero;
import com.mofei.dota.web.entity.Role;
import com.mofei.dota.web.repository.HeroRepository;
import com.mofei.dota.web.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroRepository heroRepository;

    @Override
    public List<Hero> getAllHeroes() {
        return heroRepository.findAll();
    }

    @Override
    public List<Hero> getAllHeroesByRoles(List<Role> roles) {
        return heroRepository.findAllByRoles(roles);
    }

    @Override
    public Optional<Hero> getHeroById(Long id) {
        return heroRepository.findById(id);
    }
}
