package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    public Teacher(){
        this.name="Марья Ивановна";
        this.subject="История";
    }

    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    public void evaluate (Student s){
            String mark="";
            int i = (int) (Math.random() * (6 - 2) + 2);
            System.out.println(i);
            switch(i) {
                case 2:
                    mark="неудовлетворительно";
                    break;
                case 3:
                    mark="удовлетворительно";
                    break;
                case 4:
                    mark="хорошо";
                    break;
                case 5:
                    mark="отлично";
                    break;
                default:
                    mark="восхитительно";
                    break;
            }

            System.out.println("Преподаватель "+this.name+" оценил студента с именем "+s.name+" по предмету "+this.subject+" на оценку "+mark+".");
    }

}
