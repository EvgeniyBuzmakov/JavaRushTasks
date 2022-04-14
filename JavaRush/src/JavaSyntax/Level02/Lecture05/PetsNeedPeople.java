package JavaSyntax.Level02.Lecture05;
/*Питомцам нужны люди
Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).
 */
public class PetsNeedPeople {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman Masha = new Woman();
        Cat cat = new Cat();
        cat.owner = Masha;
        Dog dog = new Dog();
        dog.owner = Masha;
        Fish fish = new Fish();
        fish.owner = Masha;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}