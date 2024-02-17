package day5;
//2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

public class Task2 {
    public static void main(String[] args) {
        Motorbike Moto1 = new Motorbike("XC", "White", 1980);
        System.out.println(Moto1.getModel()+" "+Moto1.getColour()+" "+Moto1.getYear());
    }
}

class Motorbike {
    private String model;
    private String colour;
    private int year;

    public Motorbike(String model, String colour, int year){
        this.model = model;
        this.colour = colour;
        this.year = year;
    }
    int getYear(){
        return year;
    }
    String getModel(){
        return model;
    }
    String getColour(){
        return colour;
    }
}

