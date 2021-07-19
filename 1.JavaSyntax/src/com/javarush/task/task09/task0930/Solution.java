package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j]) && (Integer.parseInt(array[j]) > Integer.parseInt(array[i])) ) {
                    String swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
                else if (!isNumber(array[i]) && !isNumber(array[j]) && isGreaterThan(array[i], array[j])){
                    String swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }









    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}



//                for (int j = i + 1; j < array.length; j++) {
//        if (isGreaterThan(array[i], array[j])) {
//        String tmp = array[i];
//        array[i] = array[j];
//        array[j] = tmp;
//        }
//        }

//        for (String x : num) {
//                System.out.println(x);
//                }
//                for (String x : wor) {
//                System.out.println(x);
//                }

//    ArrayList<String> numbers = new ArrayList<String>();
//    ArrayList<String> words = new ArrayList<String>();
//
//        for (int i = 0; i< array.length; i++)
//        {
//        if (isNumber(array[i])) {
//        numbers.add(array[i]);
//        }
//        else {
//        words.add(array[i]);
//        }
//        }
//        String[] num = numbers.toArray(new String[0]);
//        String[] wor = words.toArray(new String[0]);

//        for (int i = 0; i < num.length; i++) {
//        for (int j = i + 1; j < num.length; j++) {
//        if (Integer.parseInt(num[i]) < Integer.parseInt(num[j])) {
//        String tmp = num[i];
//        num[i] = num[j];
//        num[j] = tmp;
//        }
//        }
//        }