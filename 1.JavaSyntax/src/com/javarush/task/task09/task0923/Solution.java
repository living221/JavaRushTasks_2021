package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] spaces = new char[]{' '};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String vowels = "";
        String lefties = "";

        for (int i = 0; i < string.length(); i++) {
            if (isVowel(string.charAt(i)))
            {
//                System.out.println(string.charAt(i));
                vowels = vowels + string.charAt(i) + " ";
            }
        }

        for (int i = 0; i < string.length(); i++) {
            if (!(isVowel(string.charAt(i))) && !(isSpace(string.charAt(i))))
            {
                lefties = lefties + string.charAt(i) + " ";
            }
        }

        System.out.println(vowels);
        System.out.println(lefties);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpace(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char space : spaces) {  // ищем среди массива гласных
            if (character == space) {
                return true;
            }
        }
        return false;
    }
}