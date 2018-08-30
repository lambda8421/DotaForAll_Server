package com.mofei.dota.web.controller;

import com.mofei.dota.web.entity.Hero;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HeroController {

    @GetMapping(value = "/heroes")
    @ResponseBody
    public List<Hero> getHeroes(){
        return null;
    }

    @GetMapping(value = "/hero/{id}")
    @ResponseBody
    public Hero getHeroes(@PathVariable Long id){
        return null;
    }

}
