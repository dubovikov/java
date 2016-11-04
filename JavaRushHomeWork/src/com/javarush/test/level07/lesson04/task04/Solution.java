package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int t;
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<arr.length/2;i++)
        {
            t=arr[i];
            arr[i]=arr[((arr.length-1)-i)];
            arr[((arr.length-1)-i)]=t;
        }
        for (int a:arr) System.out.println(a);

    }
}
