package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        int count=0;
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>0)count++;
        if(b>0)count++;
        if(c>0)count++;
        System.out.println(count);
    }
}
