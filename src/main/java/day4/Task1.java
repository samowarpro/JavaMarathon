package day4;
//1. С клавиатуры вводится число n - размер массива.
// Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10 (включительно).
// Используя цикл for each вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//а) Длине массива
//б) Количестве чисел больше 8
//в) Количестве чисел равных 1
//г) Количестве четных чисел
//д) Количестве нечетных чисел
//е) Сумме всех элементов массива
//
//Пример:
//Введено число 10. Сгенерирован следующий массив:
//        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//Информация о массиве:
//Длина массива: 10
//Количество чисел больше 8: 1
//Количество чисел равных 1: 0
//Количество четных чисел: 6
//Количество нечетных чисел: 4
//Сумма всех элементов массива: 46

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner (System.in);
        int i = input.nextInt();
        int ii=0;
        int[] numbers = new int[i];
        for(int j = 0; j<i; j++){
            numbers[j]=rand.nextInt(11);
        }
        //int[] mass = {5,3,1,1,2};
        for(int x: numbers){
            System.out.print(x+" ");
        }
        System.out.println();
//Информация о массиве:
//Длина массива: 10
        System.out.print("Длина массива: "+numbers.length);
        System.out.println();
//Количество чисел больше 8: 1
        for(int x: numbers){
            if (x > 8) {
                ii = ii+1;
            }
        }
        System.out.print("Количество чисел больше 8: "+ii);
        System.out.println();
//Количество чисел равных 1: 0
        ii=0;
        for(int x: numbers){
            if (x == 1) {
                ii = ii+1;
            }
        }
        System.out.print("Количество чисел равных 1: "+ii);
        System.out.println();
//Количество четных чисел: 6
        ii=0;
        for(int x: numbers){
            if (x%2==0) {
                ii = ii+1;
            }
        }
        System.out.print("Количество четных чисел: "+ii);
        System.out.println();
//Количество нечетных чисел: 4
        ii=0;
        for(int x: numbers){
            if (x%2!=0) {
                ii = ii+1;
            }
        }
        System.out.print("Количество нечетных чисел: "+ii);
        System.out.println();
//Сумма всех элементов массива: 46
        ii=0;
        for(int x: numbers){
            ii = ii+x;
        }
        System.out.print("КСумма всех элементов массива: "+ii);
        System.out.println();
    }
}
