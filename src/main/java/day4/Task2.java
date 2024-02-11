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

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[10];
        int i = 0;
        int j = 0;
        Random rand = new Random();

        for(int result_massiv: massiv) {
            massiv[j] = rand.nextInt(10000);
            System.out.print(massiv[j]+" ");
            j=j+1;
        }
        System.out.println();

        //наибольший элемент массива
        int max = 0;
        for(int element_massiva: massiv) {
            if(element_massiva>max) {
                max = element_massiva;
            }
        }
        System.out.print("наибольший элемент массива: "+max);
        System.out.println();

        //наименьший элемент массива
        int min = Integer.MAX_VALUE;
        i = 0;
        for(int element_massiva: massiv) {
            if(element_massiva<min) {
                min = element_massiva;
            }
        }
        System.out.print("наименьший элемент массива: "+min);
        System.out.println();

        //количество элементов массива, оканчивающихся на 0
        //сумму элементов массива, оканчивающихся на 0
        int sum = 0;
        int sum0 = 0;
        massiv[1]=0;
        for(int result_massiv: massiv) {
            if(result_massiv%10==0) {
                sum0 = sum0+result_massiv;
                sum = sum+1;
            }
        }
        System.out.print("колgit iniичество элементов массива, оканчивающихся на 0: "+sum);
        System.out.println();
        System.out.print("сумму элементов массива, оканчивающихся на 0: "+sum0);
    }
}
