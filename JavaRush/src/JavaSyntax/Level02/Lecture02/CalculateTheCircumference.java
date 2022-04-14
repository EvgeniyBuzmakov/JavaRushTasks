package JavaSyntax.Level02.Lecture02;
/*
Считаем длину окружности
Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius (в методе printCircleLength).
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.
 */
public class CalculateTheCircumference {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double pi = 3.14;
        System.out.println(2 * pi * radius);
    }
}