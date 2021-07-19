package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Children1 = new Human("Bart", true, 12);
        Human Children2 = new Human("Lisa", false, 10);
        Human Children3 = new Human("Mag", false, 2);

        ArrayList<Human> childrenJr = new ArrayList<>();
        childrenJr.add(Children1);
        childrenJr.add(Children2);
        childrenJr.add(Children3);

        Human Dad = new Human("Homer", true, 40, childrenJr);
        Human Mother = new Human("Marge", false, 40, childrenJr);

        ArrayList<Human> childrenSr1 = new ArrayList<>();
        childrenSr1.add(Dad);

        ArrayList<Human> childrenSr2 = new ArrayList<>();
        childrenSr2.add(Mother);

        Human Grandfather = new Human("Ded Pihto", true, 75, childrenSr1);
        Human Grandmother = new Human("Babka Spistoletom", false, 75, childrenSr1);

        Human Grandfather1 = new Human("Ded Pihto1", true, 70, childrenSr2);
        Human Grandmother1 = new Human("Babka Spistoletom1", false, 70, childrenSr2);

        System.out.println(Grandfather.toString());
        System.out.println(Grandfather1.toString());
        System.out.println(Grandmother.toString());
        System.out.println(Grandmother1.toString());
        System.out.println(Dad.toString());
        System.out.println(Mother.toString());
        System.out.println(Children1.toString());
        System.out.println(Children2.toString());
        System.out.println(Children3.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human>children;

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
