package com.samson.BattleSimulator.model;

import com.samson.BattleSimulator.repos.ActionWarrior;

public class Swordsman implements ActionWarrior {

    private int attack = 3;
    private int defense = 6;

    public Swordsman() {
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

