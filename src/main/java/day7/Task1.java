package day7;
//1. Для этого задания скопируйте класс Самолет из предыдущего дня
// в пакет текущего дня.
//В классе Самолет реализовать статический метод compareAirplanes,
// который в качестве аргументов принимает два объекта
// класса Airplane (два самолета) и выводит сообщение в консоль о том,
// какой из самолетов длиннее.

import day7.Airplane;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus",2010,200,2500);
        Airplane plane2 = new Airplane("Boeing",2020,300,3000);
        Airplane.compareAirplanes(plane1, plane2);

    }
}