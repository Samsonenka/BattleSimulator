package com.samson.BattleSimulator.model;

import com.samson.BattleSimulator.repos.ActionWarrior;

public class SpearFighter implements ActionWarrior {

    private int attack = 2;
    private int defense = 5;

    public SpearFighter() {
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
