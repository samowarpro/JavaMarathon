package day7;

public class Airplane {

    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel=0;

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer=manufacturer;
        this.year=year;
        this.length=length;
        this.weight=weight;
    }

    public static void compareAirplanes (Airplane plane1, Airplane plane2){
        if(plane1.getLength()>plane2.getLength())
            System.out.println("Длиннее оказался: "+plane1.manufacturer);
        else if(plane1.getLength()<plane2.getLength())
            System.out.println("Длиннее оказался: "+plane2.manufacturer);
        else
            System.out.println("Оба самолета равны по длине: "+plane2.manufacturer+" и "+plane1.manufacturer);
    }

    public void info (){
        System.out.println("Изготовитель: "+manufacturer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }

    public int fillUp(int n){
        this.fuel+=n;
        return n;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getLength() {
        return length;
    }
}
