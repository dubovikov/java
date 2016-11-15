package com.javarush.test.level08.lesson11.home02;

import java.util.*;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return  result;

    }

    public static Set<Dog> createDogs()
    {
        //напишите тут ваш код
        Set<Dog> dogs=new HashSet<>();
        for (int i=0;i<3;i++)
            dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //напишите тут ваш код
        Set<Object> objects=new HashSet<>();
        objects.addAll(cats);
        objects.addAll(dogs);
        return objects;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        Iterator<Object> obj=pets.iterator();
        while (obj.hasNext()){
            System.out.println(obj.next());
        }
    }
    public static class Cat   {

    }
    public static class Dog   {
        
    }
    //напишите тут ваш код
}
