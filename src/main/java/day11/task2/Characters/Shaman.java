package day11.task2.Characters;

import day11.task2.MagicAttack;
import day11.task2.PhysAttack;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    public Shaman() {
        physAtt=10;
        physDef=0.2;
        magicAtt=15;
        magicDef=0.2;
        healTeammate=30;
        healHimself=50;
    }

    @Override
    public String toString() {
        int a = (int) health;
        return "Shaman{health=" + a +"}";
    }

    @Override
    public void healHimself() {

    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health>MIN & hero.health<=MAX){
            if(hero.health+healTeammate<=MAX){
                hero.health=hero.health+healTeammate;
            } else hero.health=MAX;
        } else System.out.println("Здоровье героя за пределами здравого смысла");
    }

    @Override
    public void magicalAttack(Hero hero) {

    }

}
