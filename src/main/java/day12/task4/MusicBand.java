package day12.task4;

import java.util.*;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    @Override
    public String toString() {
        return "name = " + name + ", year = " + year + ", members = " + members;
    }

    public MusicBand(String name, int year, List<String> members){
        this.name=name;
        this.year=year;
        this.members=members;
    }

    public static void transferMembers (MusicBand band1, MusicBand band2){
        System.out.println(band1);
        System.out.println(band2);

        List<String> newMembers = new ArrayList<>();
        newMembers.addAll(band1.getMembers());
        newMembers.addAll(band2.getMembers());
        band2.setMembers(newMembers);
        band1.getMembers().clear();

    }

    public void printMembers(){
        System.out.println(members);
    }

    public List<String> getMembers(){
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}