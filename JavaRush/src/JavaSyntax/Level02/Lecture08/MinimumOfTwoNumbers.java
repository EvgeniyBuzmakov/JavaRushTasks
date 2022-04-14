package JavaSyntax.Level02.Lecture08;
/*Минимум двух чисел Ӏ Java Syntax: 2 уровень, 8 лекция 7
Написать функцию, которая возвращает минимум из двух чисел.
 */
public class MinimumOfTwoNumbers {
    public static int min(int a, int b) {
        //напишите тут ваш код
        int c;
        if ( a < b) c = a;
        else c = b;
        return c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
    }

}