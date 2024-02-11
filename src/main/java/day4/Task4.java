package day4;
//4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//Найти максимум среди сумм трех соседних элементов.
// Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
//
//Пример:
//*Для простоты пример показан на массиве размера 10
//
//[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//
//Тройка с максимальной суммой: [8742, 1040, 3254]
//
//Вывод в консоль:
//13036
//7
//
//*Пояснение. Первое число - сумма тройки [8742, 1040, 3254].
// Второе число - индекс первого элемента тройки, то есть индекс числа 8742.

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
    Random rand = new Random();
    int[] massiv = new int[100];

        for(int i = 0; i<100; i++){
        massiv[i]= rand.nextInt(10000);
        }

        int sum=0;
        int index=0;
        for(int i = 0; i<100; i++){
            if(i < massiv.length-2 && sum<=(massiv[i]+massiv[i+1]+massiv[i+2]) ){
                sum = massiv[i]+massiv[i+1]+massiv[i+2];
                index=i;
            }
        }
        System.out.println(Arrays.toString(massiv));
        System.out.println(sum);
        System.out.println(index);
    }
}
