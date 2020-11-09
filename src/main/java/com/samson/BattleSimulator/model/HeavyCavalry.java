package com.samson.BattleSimulator.model;

import com.samson.BattleSimulator.repos.ActionWarrior;

public class HeavyCavalry implements ActionWarrior {

    private int attack = 8;
    private int defense = 7;

    public HeavyCavalry() {
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
