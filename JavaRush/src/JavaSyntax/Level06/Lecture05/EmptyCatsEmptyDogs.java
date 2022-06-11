package JavaSyntax.Level06.Lecture05;

/*Пустые кошки, пустые псы
task0602
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
 */
public class EmptyCatsEmptyDogs {

    public static void main(String[] args) {

    }
}

class Cat {
    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.print("Cat was destroyed");
    }
}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.print("Dog was destroyed");
    }
}