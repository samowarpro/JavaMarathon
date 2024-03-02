package day11.task2;

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

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health>MIN){
            if(hero.health-(physAtt-(physAtt*hero.physDef))>MIN){
                hero.health=hero.health-(physAtt-(physAtt*hero.physDef));
            } else hero.health=MIN;
        } else hero.health=MIN;
    }

}
