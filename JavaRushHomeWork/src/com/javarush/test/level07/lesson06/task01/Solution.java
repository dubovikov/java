package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("string1");
        arrayList.add("string2");
        arrayList.add("string3");
        arrayList.add("string4");
        arrayList.add("string5");
        System.out.println(arrayList.size());
        for (String s:arrayList) System.out.println(s);

    }
}
