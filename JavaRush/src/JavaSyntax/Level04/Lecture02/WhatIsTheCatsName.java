package JavaSyntax.Level04.Lecture02;
/*
Как зовут кота?
Помогите коту обрести имя с помощью метода setName.
*/
public class WhatIsTheCatsName {
}

class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
