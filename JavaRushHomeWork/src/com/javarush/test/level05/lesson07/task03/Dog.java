package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name;
    private int age;
    private String color;
    public void initialize(String name){
        this.name=name;
    }
    public void initialize(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void initialize(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

}
