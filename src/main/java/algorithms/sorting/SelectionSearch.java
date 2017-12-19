package main.java.algorithms.sorting;

import java.util.Arrays;

public class SelectionSearch {
    public static void main(String[] args) {
        int[] before = {9, 5, 2, 8, 1, -3};

        int[] after = selectionSort(before);

        System.out.println(Arrays.toString(after));
    }

    static int[] selectionSort(int[] arr) {
        /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/

        for (int i = 0; i < arr.length; i++) {
            /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */

            int min = arr[i];
            int min_i = i;

            /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/

            for (int j = i+i; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }

        }

        return arr;
    }
}
