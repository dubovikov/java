package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1=new Cat("cat1",2,4,7);
        Cat cat2=new Cat("cat2",3,4,8);
        Cat cat3=new Cat("cat3",2,4,4);
        if(cat1.fight(cat2)) System.out.println("Win:"+cat1.name);
        else System.out.println("Win: "+cat2.name);
        if(cat1.fight(cat3)) System.out.println("Win:"+cat1.name);
        else System.out.println("Win: "+cat3.name);
        if(cat3.fight(cat2)) System.out.println("Win:"+cat3.name);
        else System.out.println("Win: "+cat2.name);
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
