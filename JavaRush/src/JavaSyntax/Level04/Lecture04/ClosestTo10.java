package JavaSyntax.Level04.Lecture04;
/*Ближайшее к 10
Напиши метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
 */
public class ClosestTo10 {

    public static void main(String[] args) {
        closeToTen(-8,26);
        closeToTen(-14,-7);
    }

    public static void closeToTen(int a, int b) {

        //альтернативное решение
        //System.out.println(abs(10 - a) < abs(10 - b) ? a : b);

        System.out.println((a - 10) < (b - 10) ? a : b); //тестирую решение без вычисления модуля числа

//        if (abs(a - 10) < abs(b - 10))
//            System.out.println(a);
//        else if (abs(a - 10) > abs(b - 10))
//            System.out.println(b);
//        else
//            System.out.println(b);
    }

    public static int abs(int a) {
        if (a < 0) return -a;
        else return a;
    }
}