package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь
средний вес. Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name, adress,color;
    private int age;
    private double wheigt;

    public void initialize(String name){
        this.name=name;
        this.adress=null;
        this.color="gray";
        this.age=1;
        this.wheigt=2.5;
    }
    public void initialize(String name,double wheigt,int age){
        this.name=name;
        this.adress=null;
        this.color="gray";
        this.age=age;
        this.wheigt=wheigt;
    }
    public void initialize(String name,int age){
        this.name=name;
        this.adress=null;
        this.color="gray";
        this.age=age;
        this.wheigt=2.5;
    }
    public void initialize(double wheigt,String color){
        this.name=null;
        this.adress=null;
        this.color=color;
        this.age=1;
        this.wheigt=wheigt;
    }
    public void initialize(double wheigt,String color,String adress){
        this.name=null;
        this.adress=adress;
        this.color=color;
        this.age=1;
        this.wheigt=wheigt;
    }
}
