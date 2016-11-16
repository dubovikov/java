package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> cild=new ArrayList<>();
        cild.add(new Human("Child1",true,12,new ArrayList<Human>()));
        cild.add(new Human("Child2",true,12,new ArrayList<Human>()));
        cild.add(new Human("Child3",false,12,new ArrayList<Human>()));
        ArrayList<Human> fath=new ArrayList<>();
        ArrayList<Human> mat=new ArrayList<>();
        fath.add(new Human("Papa",true,35,cild));
        mat.add(new Human("Mat",false,35,cild));
        ArrayList<Human> grand1=new ArrayList<>();
        grand1.add(new Human("deda",true,55,fath));
        grand1.add(new Human("baba",false,55,fath));
        ArrayList<Human> grand2=new ArrayList<>();
        grand2.add(new Human("deda",true,55,mat));
        grand2.add(new Human("baba",false,55,mat));
        for (Human h:grand1)
            System.out.println(h);
        for (Human h:grand2)
            System.out.println(h);
        for (Human h:fath)
            System.out.println(h);
        for (Human h:mat)
            System.out.println(h);
        for (Human h:cild)
            System.out.println(h);

    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
