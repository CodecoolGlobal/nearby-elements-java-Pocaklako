package com.codecool;

import java.util.*;
import java.lang.reflect.Array;


public class Main {
    private static int[][] multi = new int[][]{
            {2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
            {1, 3, 5, 7},
            {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}
    };

    public static int[] nearby(int x, int y, int range) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int j = y - range; j <= y + range; j++) {
            if (j >= 0 && j < multi[x].length && y != j) {
                results.add(multi[x][j]);
            }
        }

        int[] resultsList = new int[results.size()];

        for (int i = 0; i < results.size(); i++) {
            resultsList[i] = results.get(i);
        }
        return resultsList;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int range = 5;

        int[] results = nearby(x, y, range);
        System.out.println(Arrays.toString(results));
        System.out.println("kacsa");
    }
}