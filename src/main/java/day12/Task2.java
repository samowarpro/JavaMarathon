package day12;
//2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
//Для заполнения списка реализуйте метод, который принимает числа от, до, и ссылку на список.
// Вывести список.

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTheList(0,30,list);
        System.out.println(list);
        fillTheList(300,350,list);
        System.out.println(list);

    }

    public static void fillTheList(int from, int till, List<Integer> list) {
        for (int i = from; i <= till; i++) {
            if(i%2==0)
                list.add(i);
        }
    }
}

