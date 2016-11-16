package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map=new HashMap<>();
        map.put("Крячко", "Сергей");
        map.put("Шумейко", "Ольга");
        map.put("Ендовицкий", "Максим");
        map.put("Дикун", "Людмила");
        map.put("Дикун", "Александр");
        map.put("Дикун", "Ольга");
        map.put("Табаков", "Александр");
        map.put("Ярмантович", "Станислав");
        map.put("Скочеляс", "Ольга");
        map.put("Хомышин", "Антон");
        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
