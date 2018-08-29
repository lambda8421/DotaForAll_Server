package com.mofei.dota.web.controller;

import com.mofei.dota.web.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MatchController {

    @Autowired
    private MatchService matchService;

    @RequestMapping(value = "match/{id}",method = RequestMethod.GET)
    public Object getMatch(@PathVariable Long id){
        return null;
    }
}
