package JavaSyntax.Level04.Lecture01;
/*
Подумайте, что делает программа.
Исправь ошибку в программе чтобы переменная age объекта person изменила свое значение.
*/
public class ThisAgeDoesntSuitMe {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            age = age + 20;
            System.out.println("The Age in adjustAge() is " + age);
            this.age = age;
        }
    }
}
