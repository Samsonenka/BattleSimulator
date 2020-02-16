package com.samson.BattleSimulator.repos;

import com.samson.BattleSimulator.model.SpearFighter;

import java.util.ArrayList;
import java.util.List;

public interface ActionWarrior {

    default List<SpearFighter> createArmy(int quantityUnits){

        List<SpearFighter> spearFighterList = new ArrayList<>();

        if (quantityUnits != 0){
            for (int i = 0; i < quantityUnits; i++) {
                spearFighterList.add(new SpearFighter());
            }
        }
        return spearFighterList;
    }
}
