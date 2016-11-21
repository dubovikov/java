package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        boolean sex;
        private String ras;

        public Human(String name, int age, boolean sex, String ras, double wheigt)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.ras = ras;
            this.wheigt = wheigt;
        }

        public Human(String name, int age, boolean sex, String ras)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.ras = ras;
        }

        public Human(String name, int age, boolean sex, String ras, double wheigt, Human fater, Human mater)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.ras = ras;
            this.wheigt = wheigt;
            this.fater = fater;
            this.mater = mater;
        }

        public Human(String name, int age, boolean sex, double wheigt, Human fater, Human mater)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wheigt = wheigt;
            this.fater = fater;
            this.mater = mater;
        }

        public Human(String name, int age, boolean sex, double wheigt, Human fater)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wheigt = wheigt;
            this.fater = fater;
        }

        public Human(String name, int age, boolean sex, double wheigt)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wheigt = wheigt;
        }

        public Human(String name, int age, boolean sex)
        {

            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age)
        {

            this.name = name;
            this.age = age;
        }

        public Human()
        {
            super();

        }

        public Human(String name)
        {
            this.name = name;
        }

        private double wheigt;
        private Human fater;
        private Human mater;
    }
}
