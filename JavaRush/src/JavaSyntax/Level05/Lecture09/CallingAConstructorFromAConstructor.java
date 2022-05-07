package JavaSyntax.Level05.Lecture09;

/*Вызов конструктора из конструктора
Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.
 */
public class CallingAConstructorFromAConstructor {
}

class Circle3 {

    public double x;
    public double y;
    public double radius;

    public Circle3(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle3(double x, double y) {
        //напишите тут ваш код
        this(y, x,10);
    }

    public Circle3() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle3 circle = new Circle3();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle3 anotherCircle = new Circle3(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}