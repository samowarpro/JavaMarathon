package day11.task2.Characters;

import day11.task2.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    public Magician() {
        physAtt=5;
        physDef=0;
        magicAtt=20;
        magicDef=0.8;
    }

    @Override
    public String toString() {
        int a = (int) health;
        return "Magician{health=" + a +"}";
    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health>MIN){
            if(magicAtt-(magicAtt*hero.magicDef)>MIN){
                hero.health=hero.health-(magicAtt-(magicAtt*hero.magicDef));
            } else hero.health=MIN;
        } else hero.health=MIN;
    }
}
