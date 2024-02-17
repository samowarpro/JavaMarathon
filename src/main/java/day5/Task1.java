package day5;
//1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
// Создать get и set методы для каждого поля.
// Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
// Созданный вами класс должен отвечать принципам инкапсуляции.

public class Task1 extends Car {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.setYear(1980);
        mycar.setModel("BB");
        mycar.setColour("White");

        System.out.println(mycar.getYear()+" "+mycar.getModel()+" "+mycar.getColour());
    }

}

class Car {
    private int year=2024;
    private String model="XC";
    private String colour="Transparent";

    protected void setYear(int carYear) {
        year = carYear;
    }
    protected int getYear(){
        return year;
    }
    void setModel(String carModel){
        model = carModel;
    }
    String getModel(){
        return model;
    }
    public void setColour(String carColour){
        colour = carColour;
    }
    public String getColour() {
        return colour;
    }
}