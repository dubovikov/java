package com.javarush.test.level09.lesson11.bonus01;

import java.io.*;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;

        //Считываем в цикле то, что вводится в коммандной строке
        while (true)
            try {
                String sourceFileName = reader.readLine();
                fileInputStream = new FileInputStream(sourceFileName);
                break;
                //Если указанный в ком. строке файл есть, то цикл прерываем
            }
            catch (Exception e)
            {
                System.out.println("Файл не существует.");
                String sourceFileName = reader.readLine();
                fileInputStream = new FileInputStream(sourceFileName);
                //Если указанный в ком. строке файл есть, то цикл прерываем
                break;
            }

        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);



        int count = 0;
        while (fileInputStream.available()!=0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
