package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("May 10 2013"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = null;
        date1 = df.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        //System.out.println(cal);
        int days_from_start = cal.get(Calendar.DAY_OF_YEAR);
        //System.out.println(days_from_start);
        if (days_from_start % 2 == 0) {
            return false;
        }
        else return true;

    }
}
