package day4;
//2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Затем, используя цикл for each вывести в консоль:
//наибольший элемент массива
//наименьший элемент массива
//количество элементов массива, оканчивающихся на 0
//сумму элементов массива, оканчивающихся на 0
//
//Использовать сортировку запрещено.
//
//Рекомендация:
//Для поиска наибольшего и наименьшего элемента массива переменные,
// которые будут хранить эти значения необходимо либо инициализировать уже после заполнения массива,
// первым элементом этого массива
//max =arr[0]
//min = arr{0]
//
// либо до массива, но самым "крайним" числом в диапазоне, т.е.
//    max = Integer.MIN_VALUE
//    min = Integer.MAX_VALUE
//    Это максимально универсальный подход.

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
//        int i = 0;
//        int j = 0;
        Random rand = new Random();

        for (int i = 0; i < massiv.length; i++){
            massiv[i] = rand.nextInt(10000);
        }
        System.out.println();

        //наибольший элемент массива
        //наименьший элемент массива
        //количество элементов массива, оканчивающихся на 0
        //сумму элементов массива, оканчивающихся на 0
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sumOfElements = 0;
        int sumOfElementsTailedWith0 = 0;
        for(int element_massiva: massiv) {
            if(element_massiva<min) {
                min = element_massiva;
            }
            if(element_massiva%10==0) {
                sumOfElementsTailedWith0 += element_massiva;
                sumOfElements += 1;
            }
            if(element_massiva>max) {
                max = element_massiva;
            }
        }
        System.out.print("наибольший элемент массива: "+max);
        System.out.println();
        System.out.print("наименьший элемент массива: "+min);
        System.out.println();
        System.out.print("количество элементов массива, оканчивающихся на 0: "+sumOfElements);
        System.out.println();
        System.out.print("сумму элементов массива, оканчивающихся на 0: "+sumOfElementsTailedWith0);
        System.out.println();
        System.out.println(Arrays.toString(massiv));
    }
}
