package JavaSyntax.Level05.Lecture09;

/*Максимум конструкторов
Изучи класс Circle2. Напиши максимальное количество конструкторов с разными аргументами.
не забудь про конструктор по умолчанию.
 */
public class MaximumConstructors {
}

class Circle2 {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle2 () {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle2 (double x) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2 (double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2 (double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2 (Circle2 cr) {
        this.x = cr.x;
        this.y = cr.y;
        this.radius = cr.radius;
    }

    public static void main(String[] args) {

    }
}