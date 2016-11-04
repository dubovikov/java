package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        int count1=0,count2=0;
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a>0)count1++;
        else count2++;
        if(b>0)count1++;
        else count2++;
        if(c>0)count1++;
        else count2++;
        System.out.println("количество отрицательных чисел: "+count2);
        System.out.println("количество положительных чисел: "+count1);
    }
}
