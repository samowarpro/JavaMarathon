package day12.task4;
//4.  *Выполнять в подпапке task4 в day12*
//Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и
// удалять участников списком (по несколько участников за раз, а не по одному).
// Под участником понимается строка (String) с именем и фамилией.
// Реализовать статический метод слияния групп (в классе MusicBand), т.е. все участники группы А переходят в группу B.
// Название метода: transferMembers. Этот метод принимает в качестве аргументов два экземпляра класса MusicBand.
// В классе MusicBand, реализовать метод printMembers(), печатающий список участников в консоль и метод getMembers(),
// возвращающий список участников.
//Проверить состав групп после слияния.

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        MusicBand band1 = new MusicBand("Группа1",1995, members1);
        members1.add("Пол Арбуза");
        members1.add("Улов Налимов");

        List<String> members2 = new ArrayList<>();
        MusicBand band2 = new MusicBand("Группа2",1999, members2);
        members2.add("Рекорд Надоев");
        members2.add("Захват Покоев");
        members2.add("Отряд Ковбоев");

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
