package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map=new HashMap<>();
        //list of addresses
//        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            String cyty = reader.readLine();
            if (cyty.isEmpty()) break;
            String family=reader.readLine();
            map.put(cyty,family);

//            addresses.add(family);
        }

        //read home number
        String houseNumber = reader.readLine();
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if (pair.getKey().equals(houseNumber)) System.out.println(pair.getValue());
        }

//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
    }
}
