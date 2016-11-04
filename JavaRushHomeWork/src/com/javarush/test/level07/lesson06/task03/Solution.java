package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<5;i++)
            arrayList.add(sc.nextLine());
        int length=arrayList.get(0).length();
        for (int i=1;i<arrayList.size()-1;i++)
            length=(arrayList.get(i).length()<=length)?arrayList.get(i).length():length;
        for (String s:arrayList)
            if (s.length()==length) System.out.println(s);
    }
}
