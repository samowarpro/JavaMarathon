package day11.task2;

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

}
