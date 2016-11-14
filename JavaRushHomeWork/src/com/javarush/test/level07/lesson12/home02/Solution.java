package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer N,M;
        N=Integer.parseInt(reader.readLine());
        M=Integer.parseInt(reader.readLine());
        ArrayList<String> list=new ArrayList<>();
        for (int i=0;i<N;i++)
            list.add(reader.readLine());
        for (int j=0;j<M;j++)
        {
            String s=list.get(0);
            list.remove(0);
            list.add(s);

        }
        for (String s:list)
            System.out.println(s);
        //напишите тут ваш код
    }
}
