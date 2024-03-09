package day12.task3;

public class MusicBand {
    private String name;
    private int year;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public MusicBand (String name, int year){
        this.name=name;
        this.year=year;
    }
}
