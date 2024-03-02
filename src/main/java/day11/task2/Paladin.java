package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack, MagicAttack {

    public Paladin() {
        physAtt=15;
        physDef=0.5;
        magicAtt=0;
        magicDef=0.2;
        healTeammate=10;
        healHimself=25;
    }

    @Override
    public String toString() {
        int a = (int) health;
        return "Paladin{health=" + a +"}";
    }

    @Override
    public void healHimself() {
        if(health>MIN & health<=MAX){
            if(health+healHimself<=MAX){
                health=health+healHimself;
            } else health=MAX;
        } else System.out.println("Здоровье героя за пределами здравого смысла");
    }

    @Override
    public void healTeammate(Hero hero) {

    }

    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health>MIN){
            if(hero.health-(physAtt-(physAtt*hero.physDef))>MIN){
                hero.health=hero.health-(physAtt-(physAtt*hero.physDef));
            } else hero.health=MIN;
        } else hero.health=MIN;
    }

    @Override
    public void magicalAttack(Hero hero) {

    }
}
