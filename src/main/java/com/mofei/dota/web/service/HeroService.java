package com.mofei.dota.web.service;


import com.mofei.dota.web.entity.Hero;
import com.mofei.dota.web.entity.Role;

import java.util.List;
import java.util.Optional;

public interface HeroService {
    List<Hero> getAllHeroes();
    List<Hero> getAllHeroesByRoles(List<Role> roles);
    Optional<Hero> getHeroById(Long id);

}
