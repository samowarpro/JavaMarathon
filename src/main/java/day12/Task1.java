package day12;

import java.util.ArrayList;
import java.util.List;

//1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
// Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
// Вывести список в консоль.
public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("LADA");
        cars.add("UAZ");
        cars.add("KIA");
        cars.add("BMW");
        cars.add("TANK");
        System.out.println(cars);
        cars.add(2, "CITROEN");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);

    }
}
