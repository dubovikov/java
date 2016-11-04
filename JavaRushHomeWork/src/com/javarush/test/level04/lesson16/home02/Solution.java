package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        if((x>y&&x<z)||(x<y&&x>z)) System.out.println(x);
        else {
            if((y>x&&y<z)||(y<x&&y>z)) System.out.println(y);
            else System.out.println(z);

        }
    }
}
