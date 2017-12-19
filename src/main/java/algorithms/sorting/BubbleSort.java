package main.java.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] i = {9, 5, 2, 8, 1, -3};
        Arrays.sort(i);

        int[] afterSort = bubbleSort(i);
        System.out.println(Arrays.toString(afterSort));
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println(Arrays.toString(arr));
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
//            break;
        }

        return arr;
    }
}
