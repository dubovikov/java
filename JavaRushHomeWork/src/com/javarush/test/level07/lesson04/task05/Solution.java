package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[20];
        int t;
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int[] a1=new int[10];
        int[] a2=new int[10];
        for (int i=0, j=0,k=0;i<arr.length;i++)
        {
            if (i < (arr.length / 2))
            {
                a1[j] = arr[i];
                j++;
            }
            else {
                a2[k] = arr[i];
                k++;
            }
        }
        for (int tt:a2) System.out.println(tt);



    }
}
