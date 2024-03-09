package day11.task2.Characters;

import day11.task2.PhysAttack;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        physAtt=30;
        physDef=0.8;
        magicAtt=0;
        magicDef=0;
    }

    @Override
    public String toString() {
        int a = (int) health;
        return "Warrior{health=" + a +"}";
    }

}
