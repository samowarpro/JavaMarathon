package day9.Task2;

public class Triangle extends Figure {
    private double r;
    private double s;
    private double t;

    public Triangle(double r, double s, double t, String color) {
        super(color);
        this.r = r;
        this.s = s;
        this.t = t;
    }

    @Override
    public double area(){
        double S = perimeter()/2;
        return Math.sqrt(S * (S - r) * (S - s) * (S - t));
    }

    @Override
    public double perimeter(){
        return (r + s + t);
    }

}
