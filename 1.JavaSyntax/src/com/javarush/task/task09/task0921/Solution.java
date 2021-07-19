package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList array = new ArrayList();
            try {
                while (true) {
                    array.add(Integer.parseInt(reader.readLine()));
                }
            }
            catch(NumberFormatException | IOException e)
            {
//                System.out.println("NumberFromatException");
            }
            finally {
                for (Object i: array) System.out.println(i);
            }
        //напишите тут ваш код
    }
}
