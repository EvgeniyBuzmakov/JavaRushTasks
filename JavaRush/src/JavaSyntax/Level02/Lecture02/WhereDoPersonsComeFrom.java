package JavaSyntax.Level02.Lecture02;
/*Откуда берутся Person?
В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.
*/
public class WhereDoPersonsComeFrom {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
    }

    public static class Person {
        //напишите тут ваш код
        String name;
        int age;
        int weight;
        int money;
    }
}
