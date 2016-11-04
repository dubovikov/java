package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/
//for (int i=1;i<=10;i++){
//        for (int j=1;j<=10;j++){
//        System.out.printf("%4d",i*j);
//        }
//        System.out.println();
//        }

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (int i = 1; i <= 100; i++)
        {
            if(i%2==0)
            System.out.printf("%d ",i );
        }

    }
}
