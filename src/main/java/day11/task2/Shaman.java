package day11.task2;

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

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.health > MIN) {
            if (physAtt - (physAtt * hero.physDef) > MIN) {
                hero.health = hero.health - (physAtt - (physAtt * hero.physDef));
            } else hero.health = MIN;
        } else hero.health = MIN;
    }
}
