package com.samson.BattleSimulator.controllers;

import com.samson.BattleSimulator.model.SpearFighter;
import com.samson.BattleSimulator.repos.ActionWarrior;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @PostMapping("/createBattle")
    public String createBattle(@RequestParam int spearFighterAttacker, @RequestParam int spearFighterDefender,
                               @RequestParam int wallDefender){



        return "index";
    }
}
