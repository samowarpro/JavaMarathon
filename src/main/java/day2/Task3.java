package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        int d = 0;
        boolean e = true;
        boolean f = true;
        a=a+1;
        if (a>=b){
            System.out.println("Некорректный ввод");
        }
        while (a<b){
            c = a % 5;
            d = a % 10;
            e = c == 0;
            f = d == 0;
                if(e && !f){
                    System.out.print(a+" ");
                }
            a++;
        }

    }
}
