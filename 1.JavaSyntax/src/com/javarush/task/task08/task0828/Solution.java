package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("January", 1);
        myMap.put("February", 2);
        myMap.put("March", 3);
        myMap.put("April", 4);
        myMap.put("May", 5);
        myMap.put("June", 6);
        myMap.put("July", 7);
        myMap.put("August", 8);
        myMap.put("September", 9);
        myMap.put("October", 10);
        myMap.put("November", 11);
        myMap.put("December", 12);

        Set<String> keys = myMap.keySet();

        for (String element : keys){
            if (element.contains(string)){
                System.out.println(string + " is the " + myMap.get(element) + " month");
            }
        }
    }
}
