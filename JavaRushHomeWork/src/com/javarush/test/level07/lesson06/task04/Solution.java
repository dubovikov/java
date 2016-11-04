package com.javarush.test.level07.lesson06.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<10;i++)
//            arrayList.add("");
        for (int i=0;i<10;i++)
            arrayList.add(0,sc.nextLine());
//            arrayList.add(sc.nextLine());
//        int length=arrayList.get(0).length();
//        for (int i=1;i<arrayList.size()-1;i++)
//            length=(arrayList.get(i).length()>=length)?arrayList.get(i).length():length;
        for (String s:arrayList)
             System.out.println(s);
    }
}
