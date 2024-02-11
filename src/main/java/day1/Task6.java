package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 3;
        int i = 1;
        int result = 0;
        while(i<10){
            result=i*k;
            System.out.println(i+" x "+k+" = "+result);
            i++;
        }
    }
}