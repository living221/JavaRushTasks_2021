package com.javarush.task.task10.task1002;

/* 
Задача №2 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / (float) b;

        double d = (double) a * (double) 1e-3 + (double) c;

        System.out.println(d);
    }
}
