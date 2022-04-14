package JavaSyntax.Level02.Lecture08;
/*Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 */
public class MinimumOfFourNumbers {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        if (min(a,b) < min(c,d))
            return min(a,b);
        else
            return min(c,d);
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}
/*
Объяснение :  В коде min(int a, int b) сравниваем первые два числа и возвращаем найменьшее.
В коде min(int a, int b, int c, int d) сравниваем минимальные среди двух пар и возвращаем найменьшее.
 */


//-----------------------альтернативное решение
/*public static int min(int a, int b) {
    return a < b ? a : b;
}

    public static int min(int a, int b, int c, int d) {
        return (min(a,b) < min(c, d)) ? (min(a,b)) : min(c, d);
    }
 */

//----------------------- еще альтернативное решение
/*
public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        return min(min(a,b), min(c,d));
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a <= b)
            return a;
        else
            return b;
    }
 */

//----------------------- еще альтернативное решение
/*
public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m2, m3, m4;
        m2 = min(a, b);
        m3 = min (c, d);
        m4 = min (m2, m3);
        return m4;

    }

    public static int min(int a, int b) {
        int m1;
        if (a < b)
        m1 = a;
        else
        m1 = b;
        return m1;
    }
 */