package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] s = string.split(" ");
        for (int i=0; i<s.length; i++){
            if (!s[i].isEmpty())
                s[i] = s[i].substring(0,1).toUpperCase() + s[i].substring(1);
            System.out.print(s[i]);
            if (i != s.length - 1)
                System.out.print(" ");
        }
        //напишите тут ваш код
    }
}
