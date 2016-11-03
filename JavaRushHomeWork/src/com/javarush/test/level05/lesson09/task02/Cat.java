package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private int mas;
    private int wheigt;
    private String color;
    private String adres;

    public Cat(int wheigt, String color, String adres)
    {
        this.name = null;
        this.mas = 2;
        this.wheigt = wheigt;
        this.color = color;
        this.adres = adres;
    }

    public Cat(int mas, String color)
    {
        this.name = null;
        this.mas = mas;
        this.wheigt = 1;
        this.color = color;
        this.adres = null;
    }

    public Cat(String name)
    {
        this.name = name;
        this.mas = 2;
        this.wheigt = 1;
        this.color = "gray";
        this.adres = null;
    }

    public Cat(String name, int mas, int wheigt)
    {
        this.name = name;
        this.mas = mas;
        this.wheigt = wheigt;
        this.color = "gray";
        this.adres = null;


    }

    public Cat(String name, int mas)
    {
        this.name = name;
        this.mas = mas;
        this.wheigt = 1;
        this.color = "gray";
        this.adres = null;
    }
    //напишите тут ваш код

}
