package JavaSyntax.Level04.Lecture02;
/*Кошки во Вселенной
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.
 */
public class CatsInTheUniverse {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}