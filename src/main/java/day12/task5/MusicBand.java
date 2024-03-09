package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    @Override
    public String toString() {
        return "name = " + name + ", year = " + year + ", members = " + members;
    }

    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name=name;
        this.year=year;
        this.members=members;
    }

    public static void transferMembers (MusicBand band1, MusicBand band2){
        System.out.println(band1);
        System.out.println(band2);

        List<MusicArtist> newMembers = new ArrayList<>();
        newMembers.addAll(band1.getMembers());
        newMembers.addAll(band2.getMembers());
        band2.setMembers(newMembers);
        band1.members.clear();
        System.out.println(band1.getMembers());
        System.out.println(band2.getMembers());
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public void printMembers(){
        System.out.println(members);
    }

}

