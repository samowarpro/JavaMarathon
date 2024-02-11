package day4;
//3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
// В консоль вывести индекс строки, сумма чисел в которой максимальна.
// Если таких строк несколько, вывести индекс последней из них.
// Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//        3 2 1 5 7 	// сумма - 18
//        1 2 5 6 2 	// сумма - 16
//        3 4 9 6 4	// сумма - 26
//
//        Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] massiv = new int[12][8];
        int[] massiv_summ = new int[12];
        int summa = 0;
        Random rand = new Random();

        //заполнение массива рандомными цифрами и вывод на экран
        for(int x = 0; x<massiv.length; x++){
            for(int y = 0; y<massiv[x].length; y++){
                massiv[x][y] = rand.nextInt(50);
                summa = summa + massiv[x][y];
                System.out.print(massiv[x][y]+" ");
            }
            massiv_summ[x]=summa;
            summa = 0;
            System.out.println();
        }

        // выбор максимальной строки
        int y = massiv_summ[0];
        int index = 0;
        for(int x = 0; x<massiv_summ.length; x++){
            if(massiv_summ[x]>=y){
                index = x;
                y = massiv_summ[x];
            }
        }

        System.out.println(Arrays.toString(massiv_summ));
        System.out.println("индекс строки, сумма чисел в которой максимальна = "+index+", сумма = "+y);
        System.out.println(Arrays.toString(massiv[1]));
        System.out.println(Arrays.stream(massiv[1]).sum());
    }
}

