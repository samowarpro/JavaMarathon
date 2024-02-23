package day2;

import java.util.Scanner;

//Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
// Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
// но при этом не делятся на 10 без остатка.
// Например, число 15 подходит под наше условие (делится на 5 без остатка и не делится на 10 без остатка),
// но число 20 не подходит под наше условие (делится на 5 без остатка и делится на 10 без остатка).
// Сами числа a и b в диапазоне не учитывать.
//Если a >= b вывести сообщение "Некорректный ввод".
//Пример:
//Вводим в консоли: 7 78
//Вывод: 15 25 35 45 55 65 75
//*Для получения из консоли двух чисел, разделенных пробелом, можно использовать метод nextInt() вызвав его дважды.
//Scanner scanner = new Scanner(System.in);
//int a = scanner.nextInt();
//int b = scanner.nextInt();
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        int d = 0;
        boolean e = true;
        boolean f = true;
        if (a>=b){
            System.out.println("Некорректный ввод");
        }
        a=a+1;
        for(;a<b;a++) {
            if(a%5 == 0 && a%10 != 0){
                System.out.print(a+" ");
            }
//            c = a % 5;
//            d = a % 10;
//            e = c == 0;
//            f = d == 0;
//                if(e == true && f == false ){
//                System.out.print(a+" ");
//                }

        }
    }
}
