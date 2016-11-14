package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Integer[] ar=new Integer[20];
        for (int i=0;i<ar.length;i++)
            ar[i]=Integer.parseInt(reader.readLine());
        int  maximum=ar[0];
        int  minimum=ar[0];
        for (int a:ar)
        {
            if(a>maximum)maximum=a;
            if (a<minimum)minimum=a;
        }


        //напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
