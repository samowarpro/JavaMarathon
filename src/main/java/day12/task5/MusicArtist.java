package day12.task5;
import java.util.List;

public class MusicArtist {
        private String name;
        private int years;

        public MusicArtist(String name, int years){
            this.name=name;
            this.years=years;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", years=" + years +
                    '}';
        }
}
