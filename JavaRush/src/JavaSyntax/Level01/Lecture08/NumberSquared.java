package JavaSyntax.Level01.Lecture08;
/*Число в квадрате
Напиши программу, которая выводит на экран квадрат числа 5 с помощью метода sqr.
 */
public class NumberSquared {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(sqr(5));
    }

    public static int sqr(int a) {
        return a * a;
    }
}