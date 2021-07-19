package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();

//        System.out.println(date);

//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = df.parse(date);
//        System.out.println(date1);

        SimpleDateFormat destDf = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String formattedDate = destDf.format(date1);
        System.out.println(formattedDate.toUpperCase());

    }
}
