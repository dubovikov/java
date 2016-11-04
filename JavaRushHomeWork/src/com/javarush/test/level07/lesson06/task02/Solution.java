package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
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
        int j;
        for (int i=0;i<5;i++)
            arrayList.add(sc.nextLine());
        for (int i=0;i<arrayList.size()-1;i++)
            j=(arrayList.get(i).length()>arrayList.get(i+1).length())?i:i+1;

    }
}
