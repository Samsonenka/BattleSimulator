package com.samson.BattleSimulator.model;

import java.util.ArrayList;
import java.util.List;

public class SpearFighter {

    private int OffensiveStrength = 10;
    private int GeneralDefense = 15;
    private int CavalryDefense = 45;

    public SpearFighter() {
    }

    public static List<SpearFighter> createArmy(int quantityUnits){

        List<SpearFighter> spearFighterList = new ArrayList<>();

        if (quantityUnits != 0){
            for (int i = 0; i < quantityUnits; i++) {
                spearFighterList.add(new SpearFighter());
            }
        }
        return spearFighterList;
    }

    public static void battle(List<SpearFighter> spearFighterOffenseList, List<SpearFighter> spearFighterDefenseList){

        int offense = 0;
        int defense = 0;

        for (SpearFighter spearFighter1: spearFighterOffenseList) {
            offense += spearFighter1.getOffensiveStrength();
        }

        for (SpearFighter spearFighter2: spearFighterDefenseList){
            defense += spearFighter2.getGeneralDefense();
        }

        if (offense > defense){
            System.out.println("Offense: " + offense + " " + "Defense: " + defense);
            System.out.println("Крепость захвачена!!!");
        }
            else
            System.out.println("Оборона сдержала атаку!");
    }

    public int getOffensiveStrength() {
        return OffensiveStrength;
    }

    public void setOffensiveStrength(int offensiveStrength) {
        OffensiveStrength = offensiveStrength;
    }

    public int getGeneralDefense() {
        return GeneralDefense;
    }

    public void setGeneralDefense(int generalDefense) {
        GeneralDefense = generalDefense;
    }

    public int getCavalryDefense() {
        return CavalryDefense;
    }

    public void setCavalryDefense(int cavalryDefense) {
        CavalryDefense = cavalryDefense;
    }
}
