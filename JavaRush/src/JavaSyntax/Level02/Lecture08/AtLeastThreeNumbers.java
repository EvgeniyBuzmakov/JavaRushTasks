package JavaSyntax.Level02.Lecture08;
/*Минимум трёх чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
 */
public class AtLeastThreeNumbers {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int d;
        if ( a < b)
            d = a;
        else d = b;
        if ( d < c)
            return d;
        else
            return c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println( min(1,2,3) );
        System.out.println( min(-1,-2,-3) );
        System.out.println( min(3,5,3) );
        System.out.println( min(10,5,10) );
    }

}