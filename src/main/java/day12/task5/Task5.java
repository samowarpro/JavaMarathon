package day12.task5;

import day12.task5.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//5. *Выполнять в подпапке task5 в day12*
//Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
// но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
// Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
// чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое,
// что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
// Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
// чтобы они работали с объектами класса MusicArtist.
public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        MusicBand band1 = new MusicBand("Группа1",1995, members1);
        members1.add(new MusicArtist("Пол Арбуза",36));
        members1.add(new MusicArtist("Улов Налимов",42));

        List<MusicArtist> members2 = new ArrayList<>();
        MusicBand band2 = new MusicBand("Группа2",1999, members2);
        members2.add(new MusicArtist("Рекорд Надоев",23));
        members2.add(new MusicArtist("Захват Покоев", 24));
        members2.add(new MusicArtist("Отряд Ковбоев", 25));

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
