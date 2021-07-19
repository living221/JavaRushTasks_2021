package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        //System.out.println(map);
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map <String, Cat> catsMap =  new HashMap<>();
        catsMap.put("Барсик1", new Cat("Барсик1"));
        catsMap.put("Барсик2", new Cat("Барсик2"));
        catsMap.put("Барсик3", new Cat("Барсик3"));
        catsMap.put("Барсик4", new Cat("Барсик4"));
        catsMap.put("Барсик5", new Cat("Барсик5"));
        catsMap.put("Барсик6", new Cat("Барсик6"));
        catsMap.put("Барсик7", new Cat("Барсик7"));
        catsMap.put("Барсик8", new Cat("Барсик8"));
        catsMap.put("Барсик9", new Cat("Барсик9"));
        catsMap.put("Барсик10", new Cat("Барсик10"));
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        set.addAll(map.values());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
