package com.samson.BattleSimulator.model;

import com.samson.BattleSimulator.repos.ActionWarrior;

public class Swordsman implements ActionWarrior {

    private int OffensiveStrength = 25;
    private int GeneralDefense = 57;
    private int CavalryDefense = 28;

    public Swordsman() {
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

