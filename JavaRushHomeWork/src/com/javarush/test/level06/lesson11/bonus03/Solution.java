package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
       int[] a=new int[5];
        int b;
        for (int i=0;i<5;i++) a[i]=Integer.parseInt(reader.readLine());
        for (int i=0;i<5;i++)
            for (int j=0;j<4;j++){
                if(a[j]>a[j+1]){
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;

                }
            }
        for(int i:a) System.out.println(i);
        //напишите тут ваш код
    }
}
