package day11.task2.Characters;

public abstract class Hero {
    double health=100; //(здоровье)
    double physDef; // (процент поглощения физического урона)
    double magicDef; // (процент поглощения магического урона)
    double physAtt; // (величина физической атаки), по необходимости
    double magicAtt; // (величина магической атаки), по необходимости
    double healTeammate;
    double healHimself;
    static final int MAX=100;
    static final int MIN=0;

    public void physicalAttack(Hero hero) {
        if(hero.health>MIN){
            if(hero.health-(physAtt-(physAtt*hero.physDef))>MIN){
                hero.health=hero.health-(physAtt-(physAtt*hero.physDef));
            } else hero.health=MIN;
        } else hero.health=MIN;
    }

}
