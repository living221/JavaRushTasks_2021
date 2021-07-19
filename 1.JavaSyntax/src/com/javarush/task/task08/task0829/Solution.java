package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> myMap = new HashMap<String, String>();

        List<String> list = new ArrayList<>();
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            String family = reader1.readLine();


            myMap.put(city, family);
        }
        //System.out.println(myMap);

        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        String testCity = reader3.readLine();

        Set<String> keys = myMap.keySet();

        for (String element : keys) {
            if (element.contains(testCity)) {
                System.out.println(myMap.get(element));
            }
        }



        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
