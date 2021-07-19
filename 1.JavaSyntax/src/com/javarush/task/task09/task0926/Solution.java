package com.javarush.task.task09.task0926;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] array1 = new int[] {5, 5, 5, 5, 5};
        int[] array2 = new int[] {2, 2};
        int[] array3 = new int[] {4, 4, 4, 4};
        int[] array4 = new int[] {7, 7, 7, 7, 7, 7, 7};
        int[] array5 = new int[] {};

        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);

        return list;


    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
