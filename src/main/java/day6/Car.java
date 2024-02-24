package day6;

public class Car {
    private int year=2024;
    private String model="XC";
    private String colour="Transparent";

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){
        int diff = year - inputYear;
        //System.out.println(Math.abs(diff));
        return Math.abs(diff);
    }

    public void setYear(int carYear) {
        year = carYear;
    }
    int getYear(){
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