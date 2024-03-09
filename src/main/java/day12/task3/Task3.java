package day12.task3;

import java.util.*;

//3. *Выполнять в подпапке task3 в day12*
//Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
// Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
// которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать список.
// Создать статический метод в классе Task3:
//public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
//Этот метод принимает список групп в качестве аргумента и возвращает новый список,
// состоящий из групп, основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands)
// в методе main() на вашем списке из 10 групп. Вывести в консоль оба списка (оригинальный и с группами,
// основанными после 2000 года).
public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>(Arrays.asList(new MusicBand("Группа0",1994),new MusicBand("Группа00",1994)));
        bands.add(new MusicBand("Группа1",1995));
        bands.add(new MusicBand("Группа2",1996));
        bands.add(new MusicBand("Группа3",1997));
        bands.add(new MusicBand("Группа4",1998));
        bands.add(new MusicBand("Группа5",1999));
        bands.add(new MusicBand("Группа6",2000));
        bands.add(new MusicBand("Группа7",2001));
        bands.add(new MusicBand("Группа8",2002));
        bands.add(new MusicBand("Группа9",2003));
        bands.add(new MusicBand("Группа10",2004));
        System.out.println(bands.toString());
        Collections.shuffle(bands);
        System.out.println(bands.toString());
        groupsAfter2000(bands);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bands2000 = new ArrayList<>();
        for(MusicBand i:bands){
            if (i.getYear()>2000)
                bands2000.add(i);
        }
        System.out.println(bands2000);
        return bands2000;
    }

}
