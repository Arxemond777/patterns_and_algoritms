package main.java.algorithms.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] i = {1, 5, 2, 8, 9};

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);

        System.out.println(Collections.binarySearch(l, 5));
    }
}
