package com.samson.BattleSimulator.model;

import com.samson.BattleSimulator.repos.ActionWarrior;

public class LightCavalry implements ActionWarrior {

    private int attack = 8;
    private int defense = 3;

    public LightCavalry() {
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
