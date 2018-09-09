package com.mofei.dota.web.controller;

import com.mofei.dota.web.base.Role;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @GetMapping(value = "/roles")
    @ResponseBody
    public List<Role> getRoles(){
        return null;
    }
}
