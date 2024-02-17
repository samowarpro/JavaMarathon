package day6;

public class Motorbike {
    private String model;
    private String colour;
    private int year;

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        int diff = year - inputYear;
        System.out.println(Math.abs(diff));
        return diff;
    }

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

